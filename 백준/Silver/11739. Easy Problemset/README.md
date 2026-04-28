# [Silver V] Easy Problemset - 11739

[문제 링크](https://www.acmicpc.net/problem/11739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 145, 정답: 111, 맞힌 사람: 104, 정답 비율: 78.195%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Perhaps one of the hardest problems of any ACM ICPC contest is to create a problemset with a reasonable number of easy problems. On Not Easy European Regional Contest this problem is solved as follows.</p>

<p>There are n jury members (judges). They are numbered from 1 to n. Judge number i had prepared p<sub>i</sub> easy problems before the jury meeting. Each of these problems has a hardness between 0 and 49 (the higher the harder). Each judge also knows a very large (say infinite) number of hard problems (their hardness is 50). Judges need to select k problems to be used on the contest during this meeting.</p>

<p>They start to propose problems in the ascending order of judges numbers. The first judge takes the first problem from his list of remaining easy problems (or a hard problem, if he has already proposed all his easy problems) and proposes it. The proposed problem is selected for the contest <strong>if its hardness is greater than or equal to the total hardness of the problems selected so far</strong>, otherwise it is considered too easy. Then the second judge does the same etc.; after the n-th judge, the first one proposes his next problem, and so on. This procedure is stopped immediately when k problems are selected.</p>

<p>If all judges have proposed all their easy problems, but they still have selected less than k problems, then they take some hard problems to complete the problemset regardless of the total hardness.</p>

<p>Your task is to calculate the total hardness of the problemset created by the judges.</p>

### 입력

<p>The first line of the input file contains the number of judges n (2 &le; n &le; 10) and the number of problems k (8 &le; k &le; 14). The i-th of the following n lines contains the description of the problems prepared by the i-th judge. It starts with p<sub>i</sub> (1 &le; p<sub>i</sub> &le; 10) followed by p<sub>i</sub> non negative integers between 0 and 49 &mdash; the hardnesses of the problems prepared by the i-th judge in the order they will be proposed.</p>

### 출력

<p>Output the only integer &mdash; the total hardness of the selected problems.</p>

### 힌트

<p>In the first example, three problems with hardnesses of 0, 1, and 1 are selected first. Then the first judge proposes the problem with hardness 3 and it is selected, too. The problem proposed by the second judge with hardness 1 is not selected, because it is too easy. Then the problems proposed by the third, the first, and the second judges are selected (their hardnesses are 5, 12 and 23). The following three proposed problems with hardness of 17, 1 and 20 are not selected, and the problemset is completed with a problem proposed by the third judge with hardness of 49. So the total hardness of the problemset is 94.</p>

<p>In the second example, three problems with hardnesses of 1, 1, and 2 are selected first. The second problem of the first judge (hardness 3) is too easy. The second judge is out of his easy problems, so he proposes a problem with hardness 50 and it is selected. The third judge&rsquo;s problem with hardness 5 is not selected. The judges decide to take 6 more hard problems to complete the problemset, which gives the total hardness of 54 + 6 &middot; 50 = 354.</p>