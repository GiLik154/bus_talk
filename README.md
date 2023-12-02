# bus_talk

## 개요
  1. 모두가 쉽게 버스를 예매할 수 있도록 남은 버스 좌석을 실시간으로 알려주는 서비스입니다.
  2. Jsoup을 통한 크롤링으로 작동합니다.
  3. 무분별한 크롤링을 막기 위해 DB에 캐싱을 이용하여, 다른 유저들이 함께 사용합니다.
  4. 회원가입은 따로 진행하지 않으나, Ip를 DB와 세션에 저장하여 반응이 없는 유저는 접속을 차단합니다.

## API 명세서

| 국문       | 영문            | 설명                                                                                                  |
|------------|-----------------|-------------------------------------------------------------------------------------------------------|
| 사용자     | User            | 사용자는 IP주소와 접속 시간, 사용 가능 여부를 가지고 있다.<br>사용자는 오랫동안 움직이지 않으면 접속을 차단당할 수 있다.<br>사용자는 중복으로 들어갈 수 없다.<br>사용자는 남은 버스 좌석을 조회할 수 있다. |
| 도시       | City            | 도시는 도시의 이름과 코드를 가지고 있다.<br>도시는 코드를 통해 조회할 수 있다.<br>도시는 출발 도시, 도착 도시 2군대에 사용될 수 있다. |
| 버스 스케줄 | Bus Schedules   | 계좌는 고유번호, 사용자 고유번호, 계좌이름, 계좌번호, 은행을 가지고 있다.<br>계좌는 사용자 고유번호, 계좌이름, 계좌번호, 은행넘버를 가지고 등록할 수 있다.<br>계좌의 고유번호로 계좌이름, 계좌번호, 은행을 수정할 수 있다.<br>계좌를 통해 포인트를 충전할 수 있다.<br>계좌의 고유번호는 주문에 등록이 되어야 한다.<br>계좌는 고유번호를 가지고 계좌를 삭제할 수 있다. |
| 유저 버스 예약 | User Select Bus | 예약은 유저와 버스 스케줄과 유저가 설정한 시간의 범위를 가지고 있다.<br>유저는 시간의 범위를 설정할 수 있다.(17시부터 19시 사이에 있는 버스 조회)<br>유저는 버스 스케줄을 통해 설정한 시간 내에 빈 좌석을 알 수 있다.<br>유저는 여러 개의 버스 스케줄을 가질 수 있다.<br>유저가 설정한 시간의 범위를 만들어진 시간이 벗어나면 사용 불가로 바뀐다. |


