package com.dwg.ui;

import com.dwg.service.CustomerList;
import com.dwg.util.CMUtility;

/**
 * 负责菜单的显示和处理用户操作
 *
 * @author DWG
 * @create 2020-06-13-11:23
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);
    char menuSelection;
    boolean isFlag = true;

    /**
     * 显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法
     */
    public void enterMainMenu() {

        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("                  1 添加客户                     ");
            System.out.println("                  2 修改客户                     ");
            System.out.println("                  3 删除客户                     ");
            System.out.println("                  4 客户列表                     ");
            System.out.println("                  5 退    出                     ");
            System.out.print("请选择（1 ~ 5）：");
            menuSelection = CMUtility.readMenuSelection();

            switch (menuSelection) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认退出（Y/N）:");
                    menuSelection = CMUtility.readConfirmSelection();

                    if (menuSelection == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    /**
     * 添加客户
     */
    private void addNewCustomer() {

    }

    /**
     * 修改客户
     */
    private void modifyCustomer() {

    }

    /**
     * 删除客户
     */
    private void deleteCustomer() {

    }

    /**
     * 客户列表
     */
    private void listAllCustomers() {

    }

    /**
     * 创建CustomerView实例，并调用 enterMainMenu()方法以执行程序
     *
     * @param args
     */
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();

        customerView.enterMainMenu();
    }
}
