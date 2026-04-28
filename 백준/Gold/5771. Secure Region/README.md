# [Gold II] Secure Region - 5771

[문제 링크](https://www.acmicpc.net/problem/5771)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

브루트포스 알고리즘, 정렬, 스위핑

### 문제 설명

<p>You have been hired by Mines Never Again, a non-governmental organization whose aim is to ban the use of landmines. Besides working on political aspects, such as lobbying governments to join the International Campaign to Ban Landmines, MNA also works on disarming mines left by past wars.</p>

<p>Nowadays, mines are detected by satellites or surveillance airplanes. But to disarm a mine you have to get close to it. In most cases, the only way to reach a mined field is by helicopter. To clear the field, you must find the most secure region within the field so that the helicopter can land on it. This region is a rectangle with sides parallel to the coordinate axes, with no mines inside and whose smaller side is the largest possible. More precisely, let A and B be the length of the sides of all possible rectangles that do not contain any mines and A &le; B; the most secure region is a rectangle with the largest value of A and the largest value of B. That is, among all rectangles that do not contain any mines and whose smaller side is A (largest possible), the most secure region is a rectangle that has the largest B.</p>

<p>Given the limiting rectangle of a mined field and the positions of all mines inside the field, you must write a program to find the size of the most secure region.</p>

### 입력

<p>Your program should process data for several mined fields. The first line of a mined field contains four integers X1, Y1, X2 and Y2 which bound the field. (X1 ,Y1) are the coordinates of the field&rsquo;s lower left corner, (X2 , Y2) are the coordinates of the field&rsquo;s upper right corner (&ndash;20000 &le; X1 &lt; X2 &le; 20000 and &ndash;20000 &le; Y1 &lt; Y2 &le; 20000). The second line contains a single integer N indicating the number of mines detected in the field (1 &le; N &le; 300). The following N lines contain each two integers X and Y describing the position of a mine (X1 &le; X &le; X2 and Y1 &le; Y &le; Y2 ). No two mines have the same location. The end of input is indicated when X1 = Y1 = X2 = Y2 = 0.</p>

### 출력

<p>For each mined field of the input your program should print a line with two integers A and B, where A &le; B, describing the size of the most secure region.</p>