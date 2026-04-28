# [Bronze I] Annoying Mosquitos - 5371

[문제 링크](https://www.acmicpc.net/problem/5371)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 241, 정답: 140, 맞힌 사람: 126, 정답 비율: 63.000%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Lee wants to go to bed but there are mosquitos on the wall in his room. He knows that they will try to bite him as soon as he is about to fall asleep, as they have been doing for the past couple of days. Since he appreciates the value of a good night sleep very much, he decides enough is enough and gets his fly swatter.</p>

<p>Unfortunately for him he was born with the distinct swatting disadvantage of being completely blind. The insects seem to comprehend this and keep really still to avoid triggering his heightened sense of hearing. Lee has no other choice but to hit the wall randomly, but luckily he&rsquo;s got a pretty large fly swatter: each swat hits all mosquitos in a square area of 101 by 101 units.</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 100): the number of mosquitos on the wall.</li>
	<li>n distinct lines with two space-separated integers x<sub>i</sub> and y<sub>i</sub> (&minus;1 000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 1 000): the position of the i-th mosquito.</li>
	<li>one line with an integer m (1 &le; m &le; 10 000): the number of swats Lee tries.</li>
	<li>m lines with two space-separated integers x<sub>j</sub> and y<sub>j</sub> (&minus;1 000 &le; x<sub>j</sub> , y<sub>j</sub> &le; 1 000): the midpoint of the j-th attempt.</li>
</ul>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with the number of mosquitos that get hit.</li>
</ul>