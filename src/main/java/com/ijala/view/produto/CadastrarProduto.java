package com.ijala.view.produto;

import com.ijala.util.component.FormRegisterProduct;
import com.ijala.util.SideTitlePanel;

import javax.swing.*;
import java.awt.*;

public class CadastrarProduto extends JFrame {

    public CadastrarProduto() {
        setTitle("Cadastrar Produtos");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Font labelFont = new Font("Arial", Font.BOLD, 15);
        UIManager.put("Label.font", labelFont);

        SideTitlePanel sideTitlePanel = new SideTitlePanel(screenSize);
        sideTitlePanel.setTitulo("Cadastro de\nProduto");

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(Color.decode("#2B2B2B"));

        FormRegisterProduct formCadastroProduto = new FormRegisterProduct();
        JPanel formPanel = formCadastroProduto.getFormPanel();
        mainPanel.add(formPanel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sideTitlePanel.getSideTitlePanel(), mainPanel);
        splitPane.setDividerLocation(screenSize.width / 3);
        splitPane.setDividerSize(0);
        splitPane.setResizeWeight(0.3);
        getContentPane().add(splitPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastrarProduto ex = new CadastrarProduto();
            ex.setVisible(true);
        });
    }
}
