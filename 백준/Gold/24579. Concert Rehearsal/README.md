# [Gold I] Concert Rehearsal - 24579

[문제 링크](https://www.acmicpc.net/problem/24579)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 26, 맞힌 사람: 20, 정답 비율: 38.462%

### 분류

수학, 자료 구조, 이분 탐색, 두 포인터, 희소 배열

### 문제 설명

<p>A class of n music students are going to rehearse for a concert in a recital hall. In one rehearsal pass, each student will give one performance in order from student 1 to student n. Student i&rsquo;s performance has a duration of d<sub>i</sub>. After the last student&rsquo;s performance concludes, a new rehearsal pass will start immediately, beginning with the performance of student 1.</p>

<p>On each day, the recital hall will be open for a fixed duration of p. At any moment if the next student&rsquo;s performance cannot complete before the recital hall closes, all the remaining performances within the current rehearsal pass will be moved to the next day.</p>

<p>In k days, how many full rehearsal passes can the class complete?</p>

### 입력

<p>The first line of input contains three integers n, p, k (1 &le; n &le; 2 &middot; 10<sup>5</sup>, 1 &le; p, k &le; 10<sup>9</sup>). Each of the next n lines contains a single integer. The ith line gives d<sub>i</sub> (1 &le; d<sub>i</sub> &le; p).</p>

### 출력

<p>Output the number of full rehearsal passes the class can complete in k days.</p>