# [Gold II] Dueling Philosophers Problem - 4700

[문제 링크](https://www.acmicpc.net/problem/4700)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 13, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

그래프 이론, 그래프 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Following a sad and strange incident involving a room full of philosophers, several plates of spaghetti, and one too few forks, the faculty of the Department of Philosophy at University have been going through the papers of a recently deceased colleague. The faculty members were amazed to find numerous unpublished essays. They believe that the essays, collected into one volume, may constitute a major work of scholarship that will give their department some much-needed positive publicity. Naturally, all of the faculty members began to vie for the honor (to say nothing of the fame) of serving as editor of the collection.</p>

<p>After much debate, the faculty members have narrowed the list to two candidates. Both applicants were asked to explain how they would arrange the essays within the final book. Both have noted that many of the essays define terminology and concepts that are explored in other essays, and both have agreed to the basic principle that an essay that uses a term must itself define that term or appear after the essay that defines it.</p>

<p>One of the candidates has presented what he claims is the only possible arrangement of the essays under those constraints, and is arguing that he should be given the job simply because he has already done this major part of the work. The second candidate scoffs at this claim, insisting that there are many possible arrangements of the essays, and that an editor of true skill (himself) is needed to choose the optimal arrangement.</p>

<p>Write a program to determine if zero, one, or more than one arrangement of the essays is possible.</p>

### 입력

<p>There will be multiple test cases in the input.</p>

<p>Each test case will begin with a line with two integers, n (1 &le; n &le; 1, 000) and m (1 &le; m &le; 50, 000), where n is the number of essays, and m is the number of relationships between essays caused by sharing terms.</p>

<p>On each of the next m lines will be two integers, d and u (1 &le; u,d &le; n, d ̸= u) which indicate that a term is defined in essay d and used in essay u.</p>

<p>The input will end with two 0s on their own line.</p>

### 출력

<p>For each test case, print a single line of output containing a 0 if no arrangement is possible, a 1 if exactly one arrangement is possible, or a 2 if multiple arrangements are possible (the output will be &ldquo;2&rdquo; no matter how many arrangements there are).</p>