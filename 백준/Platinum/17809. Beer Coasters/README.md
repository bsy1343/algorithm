# [Platinum III] Beer Coasters - 17809

[문제 링크](https://www.acmicpc.net/problem/17809)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 11, 맞힌 사람: 11, 정답 비율: 31.429%

### 분류

수학, 기하학, 많은 조건 분기, 미적분학

### 문제 설명

<p>Often, in an average pub, the beer is served in a mug which is, quite obviously, wet from inside, but also wet from outside. The barkeeper typically has no capacity to dry freshly washed mugs. To protect the table and the (optional!) tablecloth, beer coasters are used in most pubs. Originally, the beer coasters were round, nowadays you can find a variety of different shapes. Despite being perceived as slightly unorthodox, square and even rectangular coasters are manufactured and used daily in many self-respecting restaurants, taverns, beer houses and drinkeries of high and low profiles.</p>

<p>A research related to the well-known satiric Ig Nobel Prize is being conducted in local pubs. The research aims to measure the rate of wear of the rectangular coasters. The rate of wear depends also on how much a coaster is getting wet from the contact with the wet bottom of beer mugs. That, in turn, depends on the exact area of contact between the mug and the coaster. The exact position of the coaster and the mug on the table is recorded each time the mug is put on the coaster.</p>

<p>Many sophisticated calculations in the research take as input the area of contact, which has to be calculated by a suitable computer program. You are to write such a program.</p>

### 입력

<p>The input contains 7 space-separated integers on a single line. The first three integers X, Y , R describe the coordinates of the beer mug bottom on the table. The center of the mug bottom is at (X, Y) and the radius of the mug bottom is R. The next four integers A<sub>x</sub>, A<sub>y</sub>, B<sub>x</sub>, B<sub>y</sub> describe the coordinates of two opposite corners, (A<sub>x</sub>, A<sub>y</sub>) and (B<sub>x</sub>, B<sub>y</sub>), of the coaster on the table. The coaster is a rectangle placed with its sides parallel to the coordinate axes. All coordinates are in the range from &minus;1 000 to 1 000, the radius is in the range from 1 to 1 000. The radius and the coordinates are expressed in the same units of length.</p>

### 출력

<p>Output a single decimal number with precision of 4 digits after the decimal point, the area of contact between the coaster and the beer mug.</p>