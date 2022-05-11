package Thi;

import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount=0;

    public Account()
    {
        this.customerCode=customerCode;
        this.customerName=customerName;
        this.accNumber=accNumber;
        this.amount=amount;
    }
    public void input()
    {
        Scanner  a1 = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        customerName =a1.nextLine();
        System.out.println("Moi ban nhap customerCode");
        customerCode = a1.nextLine();
        if(customerCode.length()<5)
        {
            System.out.println("Ma khach hang phai co hon 5 ki tu");
        }
        else
        {
            System.out.println(customerCode);
        }
        System.out.println("Moi ban nhap mat khau: ");
        accNumber = a1.nextInt();
        System.out.println("Moi ban nhap so luong");
        amount = a1.nextInt();
        if(amount<100000)
        {
            System.out.println("Moi ban nhap lai so tien");
        }
        else if(amount>101000)
        {
            System.out.println("Moi ban nhap lai so tien");
        }
        else
        {
            System.out.println(amount);
        }
    }
    public void depositAndWithdraw()
    {
        long money;
        int type;
        Scanner a2 = new Scanner(System.in);
        System.out.println("Moi ban chon 1 or 0");
        type = a2.nextInt();
        System.out.println("Nhap so tien: ");
        money = a2.nextLong();

        if(type==0)
        {
            System.out.println("Ban muon gui tien vao tai khoan");
            System.out.println("Da them tien vao tai khoan");
            amount += money;
            System.out.println("Amount: "+amount);
        }
        if(type==1)
        {
            if(money > amount)
            {
                System.out.println("so tien lon hon tai khoan ban dang co");
            }
            else
            {
                System.out.println("Nhap so tien ban muon rut: ");
                amount -= money;
                System.out.println("Amount: "+amount);
            }
        }
    }
    public String toString()
    {
        return customerCode +" "+customerName+" "+accNumber+" "+amount;
    }


}
