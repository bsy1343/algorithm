# [Gold V] Centipede - 13041

[문제 링크](https://www.acmicpc.net/problem/13041)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 21, 맞힌 사람: 16, 정답 비율: 30.189%

### 분류

그리디 알고리즘, 정렬, 스위핑

### 문제 설명

<p>When Phil was a boy he had a centipede. Everybody knows that centipedes have lots of legs, Phil&#39;s one had a total of n legs, some of the legs were left, the other ones were right. Each day the centipede used some of its legs, it always used at least one left leg and at least one right leg.</p>

<p>Each day Phil wrote down two integers to his notebook: the number of left legs and the number of right legs used by the centipede that day.</p>

<p>Phil now wants to use his notes to find out how many left legs and how many right legs his centipede had. However, Phil was not perfectly accurate, so he could make mistakes in his notes. Phil says that his note l<sub>i</sub>, r<sub>i</sub> is correct if the centipede had at least l<sub>i</sub> left legs and at least r<sub>i</sub> right legs.</p>

<p>Help Phil to find out how many left legs and how many right legs could his centipede have, so that the maximum number of his notes were correct.</p>

### 입력

<p>Input contains several test cases. The first line of input contains t &mdash; the number of test cases (1 &le; t &le; 10 000).</p>

<p>Each test case starts with a line that contains an integer n (2 &le; n &le; 10<sup>9</sup>) &mdash; the total number of centipede legs. The following line contains m (1 &le; m &le; 10<sup>5</sup>) &mdash; the number of Phil&#39;s notes.</p>

<p>The following m lines contain two integers l<sub>i</sub>, r<sub>i</sub> each (1 &le; l<sub>i</sub>, r<sub>i</sub> &le; n) &mdash; the number of left legs and right legs used by the centipede on the i-th day, according to Phil&#39;s notes.</p>

<p>The total number of notes in all test cases in one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case print one line with two integers: the number of left legs and the number of right legs the centipede could have so that the maximum number of notes were correct.</p>

<p>&nbsp;</p>