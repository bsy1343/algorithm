# [Gold I] MIPT Campus - 26253

[문제 링크](https://www.acmicpc.net/problem/26253)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

스위핑

### 문제 설명

<p>A part of Dolgoprudny that belongs to MIPT is very convenient for students. Long Pervomayskaya street divides Dolgoprudny into two parts: university (study) buildings are on the left side of this street, and dormitories are on the right side. Assume $0X$-axis is collinear to that street. The width of Pervomayskaya street and distances from the buildings to the street are negligible, so you may consider this model as one-dimentional.</p>

<p>There are exactly $n$ students of MIPT that attend the classes. Every morning each of them goes from his dormitory to his study building, crossing the Pervomayskaya street. $i$-th student lives in dormitory with $x$-coordinate $a_i$ and studies in the building with $x$-coordinate $b_i$. Students can cross the street only at crosswalks. The are $m$ crosswalks perpendicular to the $0X$-axis which are located in points with $x$-coordinates $c_1, c_2, \ldots, c_m$. While going to the study building, students always choose the shortest way to reach it.</p>

<p>Recently the Youth Committee of MIPT has concluded that the number of crosswalks is not enough for students. They lobbied the initiative to make a new crosswalk at any point of Pervomayskaya street. So now they want to make a new crosswalk in such a way that the sum of distances walked by all the students on their way from their dormitories to the study buildings is minimized. Your task is to find this minimum value.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 5 \cdot 10^5$) --- the number of students attending classes at MIPT.</p>

<p>Each of the next $n$ lines contain two integers $a_i, b_i$ ($1 \le a_i, b_i \le 10^9$) --- the coordinates of the dormitory and the study building of $i$-th student.</p>

<p>The next line contains an integer $m$ ($0 \le m \le 5 \cdot 10^5$) --- the number of crosswalks.</p>

<p>The last line contains $m$ distinct integers $c_1, c_2, \ldots, c_m$ ($1 \le c_i \le 10^9$) --- the coordinates of crosswalks.</p>

### 출력

<p>Output one integer in a single line --- the minimal sum of distance students have to travel after the building of a new crosswalk. It can be proven that the answer is always an integer.</p>