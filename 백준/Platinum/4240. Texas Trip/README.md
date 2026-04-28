# [Platinum III] Texas Trip - 4240

[문제 링크](https://www.acmicpc.net/problem/4240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 16, 맞힌 사람: 10, 정답 비율: 21.739%

### 분류

기하학, 휴리스틱, 삼분 탐색

### 문제 설명

<p>After a day trip with his friend Dick, Harry noticed a strange pattern of tiny holes in the door of his SUV. The local American Tire store sells fiberglass patching material only in square sheets. What is the smallest patch that Harry needs to fix his door?</p>

<p>Assume that the holes are points on the integer lattice in the plane. Your job is to find the area of the smallest square that will cover all the holes.</p>

### 입력

<p>The first line of input contains a single integer T expressed in decimal with no leading zeroes, denoting the number of test cases to follow. The subsequent lines of input describe the test cases.</p>

<p>Each test case begins with a single line, containing a single integer n expressed in decimal with no leading zeroes, the number of points to follow; each of the following n lines contains two integers x and y, both expressed in decimal with no leading zeroes, giving the coordinates of one of your points.</p>

<p>You are guaranteed that T &lt;= 30 and that no data set contains more than 30 points. All points in each data set will be no more than 500 units away from (0,0).</p>

### 출력

<p>Print, on a single line with two decimal places of precision, the area of the smallest square containing all of your points. An answer will be accepted if it lies within 0.1 of the correct answer.</p>