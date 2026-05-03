use myapp;

create table UserInfo (
UserID varchar(50) primary key, #회원 아이디:중복불가
UserPW varchar(255), #해쉬로 변환해서 저장
UserName varchar(50), #닉네임:중복가능
Email varchar(50), #이메일 문자 및 본인 확인 용도
CreateAt TimeStamp, #가입날짜
Balance float #지갑
);

create table Item(
ItemName varchar(50) primary key, #물건 이름
UserID varchar(50),
PostingDay TimeStamp, #물건 게시일
ClosingDay TimeStamp, #물건 마감일
presence bool, #물건의 유무
price float, #가격
Discribtion varchar(255), #설명칸
foreign key(UserID) references UserInfo(UserID)
);

create table Trade(
TradeID varchar(20), #거래번호
ItemName varchar(50), #물품이름
LenderID varchar(50), #빌려준 회원 아이디
BorrowerID varchar(50), #빌려간 회원 아이디
LendingTime TimeStamp, #빌려간 시간
ReturningTime TimeStamp, #반납시간
ItemReturn bool, #반납 여부
price float, #가격
foreign key(ItemName) references Item(ItemName),
foreign key(LenderID) references UserInfo(UserID),
foreign key(BorrowerID) references UserInfo(UserID)
);