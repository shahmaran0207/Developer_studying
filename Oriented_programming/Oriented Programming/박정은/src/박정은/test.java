package 박정은;
import java.util.LinkedList;
import java.util.Scanner;

class Controller {
    LinkedList<Member> list = new LinkedList<Member>();
    Scanner sc = new Scanner(System.in);

    void showMenu() {
        System.out.println("1: 회원 생성");
        System.out.println("2: 회원 삭제");
        System.out.println("3: 회원 전체");
        System.out.println("4: 회원 검색");
        System.out.println("5: 회원 정렬");
    }

    void delete() {
        System.out.println("삭제할 타입를 입력하세요 (고객: 1, 판매자: 2): ");
        int del = sc.nextInt();

        System.out.println("삭제할 id를 입력하세요: ");
        String delId = sc.next();

        for (int i = 0; i < list.size(); i++) {
            Member member = list.get(i);
            if (member.getId().equals(delId)) {
                list.remove(i);
                System.out.println("삭제 완료");
                return;
            }
        }
        System.out.println("해당 id를 가진 회원이 없습니다.");
    }

    void whole() {
        for (Member member : list) {
            System.out.println(member.toString());
        }
    }

    void search() {
        System.out.print("검색하려는 회원의 id를 입력하세요: ");
        String searchId = sc.next();
        boolean found = false;

        for (Member member : list) {
            if (member.getId().equals(searchId)) {
                System.out.println(member.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("해당 id를 가진 회원이 없습니다.");
        }
    }

    void add() {
        System.out.print("추가할 고객 타입 입력(고객: 1, 판매자: 2): ");
        int type = sc.nextInt();

        System.out.print("id, pw, 이름: ");
        String id = sc.next();
        String pw = sc.next();
        String name = sc.next();

        if (type == 1) {
            System.out.print("주소 입력: ");
            String address = sc.next();
            Customer customer = new Customer(id, name, pw, address);
            if (!isIdExists(id)) {
                list.add(customer);
                System.out.println("고객 추가 완료");
            } else {
                System.out.println("이미 존재하는 id입니다.");
            }
        } else if (type == 2) {
            System.out.print("가게 이름 입력: ");
            String storeName = sc.next();
            Seller seller = new Seller(id, name, pw, storeName);
            if (!isIdExists(id)) {
                list.add(seller);
                System.out.println("판매자 추가 완료");
            } else {
                System.out.println("이미 존재하는 id입니다.");
            }
        } else {
            System.out.println("올바른 타입을 입력하세요.");
        }
    }

    boolean isIdExists(String id) {
        for (Member member : list) {
            if (member.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    void sort() {
    }

    void run() {
        int menu;
        do {
            showMenu();
            System.out.print(">> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    whole();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    sort();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 정보입니다.");
            }
        } while (menu != 0);

        sc.close();
    }
}

class Member {
    String id;
    String name;
    String pw;

    Member(String id, String name, String pw) {
        this.id = id;
        this.name = name;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    @Override
    public String toString() {
        return String.format("이름: %s, id: %s", name, id);
    }
}

class Customer extends Member {
    String address;

    Customer(String id, String name, String pw, String address) {
        super(id, name, pw);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 주소: %s", address);
    }
}

class Seller extends Member {
    String storeName;

    Seller(String id, String name, String pw, String storeName) {
        super(id, name, pw);
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", 가게 이름: %s", storeName);
    }
}

public class test {
    public static void main(String[] args) {
        new Controller().run();
    }
}