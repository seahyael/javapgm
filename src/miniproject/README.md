# Java Shopping List Manager

A command-line shopping list manager built as the final project for an introductory Java programming course.

기초 Java 프로그래밍 수업의 기말 프로젝트로 만든 콘솔 기반 쇼핑 목록 관리 프로그램입니다.

## Features | 주요 기능

- Add items with a name, manufacturer, price, and quantity  
  상품명, 제조사, 가격, 수량을 입력해 항목 추가
- Edit an item by its list number  
  목록 번호를 선택해 항목 수정
- View the current shopping list  
  현재 쇼핑 목록 조회
- Delete an item by its list number  
  목록 번호를 선택해 항목 삭제
- Save the current list to a text file  
  현재 목록을 텍스트 파일로 저장

## Implementation | 구현 내용

- Stores items as `Shop` objects in an `ArrayList`
- Separates the menu, item model, and CRUD operations into Java classes
- Writes the current in-memory list to `shoppinglist.txt`

- `Shop` 객체를 `ArrayList`에 저장
- 메뉴, 상품 데이터, CRUD 동작을 Java 클래스로 분리
- 메모리에 있는 목록을 `shoppinglist.txt`에 저장

The list is kept in memory while the program runs. Saved items are not loaded automatically the next time the program starts.

목록은 프로그램 실행 중 메모리에 저장됩니다. 저장한 항목을 다음 실행 때 자동으로 불러오지는 않습니다.

## Tech Stack | 기술 스택

- Java
- Java Collections Framework (`ArrayList`)
- Java file I/O


## Screenshots | 실행 화면

The screenshots are currently stored in the coursework archive.

실행 화면 캡처는 현재 Java 과제 모음 저장소에 있습니다.

- [Screenshot 1 — Adding items and handling an invalid selection](https://github.com/seahyael/2024-java-programming/blob/main/src/miniproject/screenshots/screenshot1.png)
- [Screenshot 2 — Editing an item and saving the list](https://github.com/seahyael/2024-java-programming/blob/main/src/miniproject/screenshots/screenshot2.png)
- [Screenshot 3 — Displaying and saving the shopping list](https://github.com/seahyael/2024-java-programming/blob/main/src/miniproject/screenshots/screenshot3.png)
