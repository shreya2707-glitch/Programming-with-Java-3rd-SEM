import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Libraryman extends JFrame {
    JTextField idField, titleField, authorField, publisherField;
    JTable table;
    DefaultTableModel model;
    Connection con;

    Libraryman() {
        setTitle("Library Management System");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/libraryDB",
                "root",
                "Prachi@2007"
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        JPanel form = new JPanel(new GridLayout(4, 2, 5, 5));

        idField = new JTextField();
        titleField = new JTextField();
        authorField = new JTextField();
        publisherField = new JTextField();

        form.add(new JLabel("Book ID:"));
        form.add(idField);
        form.add(new JLabel("Book Title:"));
        form.add(titleField);
        form.add(new JLabel("Author:"));
        form.add(authorField);
        form.add(new JLabel("Publisher:"));
        form.add(publisherField);

        add(form, BorderLayout.NORTH);

        model = new DefaultTableModel(
            new String[]{"Book ID", "Title", "Author", "Publisher"}, 0
        );
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel buttons = new JPanel();

        JButton addButton = new JButton("Add Book");
        JButton viewButton = new JButton("View Books");
        JButton searchButton = new JButton("Search by ID");
        JButton deleteButton = new JButton("Delete Book");
        JButton clearButton = new JButton("Clear");

        buttons.add(addButton);
        buttons.add(viewButton);
        buttons.add(searchButton);
        buttons.add(deleteButton);
        buttons.add(clearButton);

        add(buttons, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addBook());
        viewButton.addActionListener(e -> viewBooks());
        searchButton.addActionListener(e -> searchBook());
        deleteButton.addActionListener(e -> deleteBook());
        clearButton.addActionListener(e -> clearFields());

        viewBooks();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void addBook() {
        try {
            String sql = "INSERT INTO books VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(idField.getText()));
            ps.setString(2, titleField.getText());
            ps.setString(3, authorField.getText());
            ps.setString(4, publisherField.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Book added successfully!");
            ps.close();
            viewBooks();
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void viewBooks() {
        try {
            model.setRowCount(0);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("publisher")
                });
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void searchBook() {
        try {
            String sql = "SELECT * FROM books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idField.getText()));

            ResultSet rs = ps.executeQuery();
            model.setRowCount(0);

            if (rs.next()) {
                idField.setText(rs.getString("book_id"));
                titleField.setText(rs.getString("title"));
                authorField.setText(rs.getString("author"));
                publisherField.setText(rs.getString("publisher"));

                model.addRow(new Object[]{
                    rs.getInt("book_id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("publisher")
                });
            } else {
                JOptionPane.showMessageDialog(this, "Book not found!");
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void deleteBook() {
        try {
            String sql = "DELETE FROM books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idField.getText()));

            int result = ps.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Book deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Book not found!");
            }

            ps.close();
            viewBooks();
            clearFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    void clearFields() {
        idField.setText("");
        titleField.setText("");
        authorField.setText("");
        publisherField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryManagement());
    }
}