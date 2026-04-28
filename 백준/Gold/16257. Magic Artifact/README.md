# [Gold III] Magic Artifact - 16257

[문제 링크](https://www.acmicpc.net/problem/16257)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

수학, 그리디 알고리즘, 정렬, 확률론

### 문제 설명

<p>Maxim is playing a video game. It has n levels, numbered from 1 to n. Levels can be completed in any order, it takes Maxim a<sub>i</sub> seconds to complete the i-th level.</p>

<p>Maxim can find a magic artifact at one of the levels. There is exactly one magic artifact in the game, and once found it will increase the speed of Maxim&#39;s hero and reduce the time needed to complete the level. However, it is not known where the artifact is, the probability that it is at the i-th level is p<sub>i</sub>. The time needed to complete the i-th level after the artifact is found is b<sub>i</sub> second (b<sub>i</sub>&thinsp;&le;&thinsp;a<sub>i</sub>). Note that artifact doesn&#39;t reduce the time needed to complete the level where it is found.</p>

<p>Maxim wants to choose the order he completes the levels, to minimize the expected time to complete the game. Help him to find the minimal possible expected time. Maxim must choose the order to complete the levels before playing the game, the order must not depend on whether the artifact was found or not at some level.</p>

<p>Recall that the expectation of a random variable is the sum over all possible outcomes of a product of the probability of such outcome and the value of the variable. In this problem the outcome corresponds to the level where the artifact is, and the value is the total time needed if the artifact is at that level.</p>

### 입력

<p>Input data contains several test cases. The first line contains t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;1000).</p>

<p>Each test case is described in the following way: the first line contains integer n &mdash; the number of levels (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>5</sup>).</p>

<p>The following n lines describe levels. Each level is specified with three integers a<sub>i</sub>, b<sub>i</sub> and x<sub>i</sub> &mdash; the time to complete the level before the artifact was found, the time to complete it after the artifact was found, and the value that helps to find the probability to find the artifact at that level. The probability is calculated using the formula p<sub>i</sub>&thinsp;=&thinsp;x<sub>i</sub>&thinsp;/&thinsp;10<sup>7</sup> (1&thinsp;&le;&thinsp;b<sub>i</sub>&thinsp;&le;&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;10<sup>5</sup>; 0&thinsp;&le;&thinsp;x<sub>i</sub>&thinsp;&le;&thinsp;10<sup>7</sup>; the sum of all x<sub>i</sub> is 10<sup>7</sup>).</p>

<p>The sum of values of n in all test cases of one input data is at most 5&middot;10<sup>5</sup>.</p>

### 출력

<p>For each test case output one floating point value &mdash; the expected time to complete the game if the optimal order was chosen. The answer must have an absolute or relative error of at most 10<sup>-6</sup>.</p>