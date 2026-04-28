# [Gold II] Lord of the Ring - 3792

[문제 링크](https://www.acmicpc.net/problem/3792)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>Frodo must accomplish a noble and difficult mission, he must destroy a magic and wicked ring. In this quest, he must travel to a dangerous place called Modor and throw the ring into a crevice of fire. He has left home for some time and is currently following a straight and quite long road that has bushes from place to place. Being very tired Frodo thinks he would better have some rest. The only safe place along the road is a bush the position of which can be computed using a magic formula that uses the value P that is the product of the distances between pairs of adjacent bushes along the road. Unfortunately what Frodo knows are only the distances between every pair of bushes along the road and the magic formula, but he doesn&#39;t know the value of P. Can you help him in this respect?</p>

### 입력

<p>Each data set in the file stands for a particular set of distances between pairs of bushes on the road Frodo is traveling along. Each data set starts with the number of distances followed by the distances in nondecreasing order. White spaces can occur freely in the input.</p>

<p>It is known that there are at least two bushes and at most 1000 bushes along the road. Moreover, the value of P cannot exceed 10<sup>9</sup>.</p>

### 출력

<p>For each set of data the program computes the value of P to the standard output from the beginning of a separate line. If P cannot be computed from the data set the output is &quot;No solution&quot;.</p>