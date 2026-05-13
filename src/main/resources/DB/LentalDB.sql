create schema lentaldb;

use lentaldb;

create table UserInfo (
UserCode bigint auto_increment primary key, -- 유저 일련번호:중복불가
UserID varchar(50) not null,  -- 회원 로그인용 아이디:중복불가
UserPW varchar(255) not null,    -- 해쉬로 변환해서 저장
UserName varchar(50) not null,   -- 닉네임:중복가능
Email varchar(50),               -- 이메일 문자 및 본인 확인 용도
JoiningDay datetime default current_timestamp, -- 가입날짜
Deposit int default 0            -- 지갑
);

create table ItemInfo(
    -- 고유 식별자 숫자를 추가하는 것을 추천합니다
    
    ItemId BIGINT AUTO_INCREMENT PRIMARY KEY, 
	UserCode bigint NOT NULL,   -- 등록자 코드
    
    ItemName VARCHAR(50) NOT NULL, -- 물건 이름
    
    PostingDay DATETIME default current_timestamp,  -- 물건 게시일
    ClosingDay DATETIME,           -- 물건 마감일
    presence BOOLEAN DEFAULT TRUE, -- 물건 유무 (기본값 설정)
    
    price INT,                     -- 가격
    SecurityDeposit int default 0, -- 보증금
    Describtion varchar(255),      -- 설명칸
    foreign key(UserCode) references UserInfo(UserCode)
    );

create table Trade(
TradeID BIGINT AUTO_INCREMENT PRIMARY KEY,-- 거래번호
ItemID BIGINT,
ItemName varchar(50),              -- 물품이름
LenderCode bigint not null,             -- 빌려준 회원 코드
BorrowerCode bigint not null,           -- 빌려간 회원 코드
LendingTime datetime,              -- 빌려간 시간
ReturningTime datetime,            -- 반납시간
ItemReturn bool default False,     -- 반납 여부
Damaged bool default False,        -- 손상여부
price int,                         -- 기존 가격+손상시, 보증금
foreign key(ItemID) references ItemInfo(ItemID),
foreign key(LenderCode) references UserInfo(UserCode),
foreign key(BorrowerCode) references UserInfo(UserCode)
);