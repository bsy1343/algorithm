# [Platinum V] Lutrija - 17818

[문제 링크](https://www.acmicpc.net/problem/17818)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 94, 정답: 37, 맞힌 사람: 33, 정답 비율: 41.772%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 해 구성하기, 깊이 우선 탐색, 소수 판정

### 문제 설명

<p>Grandpa Vedran is watching his favorite lottery show on TV in the hopes of becoming an overnight millionaire. The lottery balls are spinning and bouncing around before yielding the following draw: 2, 5, 7, 11, 19, 23 and 31.</p>

<p>Vedran sighs as he didn&rsquo;t guess a single one of those numbers. &ldquo;Looks like I&rsquo;m past my prime...&rdquo;, he thought to himself while turning off the old TV. His vision is also getting worse, so he pressed the wrong button on the remote control and switched to the COCI channel.</p>

<p>The host, Mr. Malnar, calmly spoke: &ldquo;Dear viewers, on the left side of the screen I will show you a prime number A and on the right side of the screen I will show you a prime number B. The first person that calls in with an array of prime numbers which starts with A, ends with B and has a prime absolute difference between each two neighbouring elements will receive a free trip to IOI 2020 in Singapore.&rdquo;</p>

<p>Old Vedran is reminiscing about his glory days of being a competitive programmer. Unfortunately, he is rusty and is not able to solve the problem. Being kindhearted, you decide to help Vedran win a trip to Singapore.</p>

<p>Note: A prime number is a positive integer greater than 1 that is only divisible by 1 and itself</p>

### 입력

<p>The first line contains two prime numbers A and B (2 &le; A, B &le; 10<sup>14</sup>, A &ne; B) from the task description.</p>

### 출력

<p>If the task is impossible, i.e., there is no array satisfying the conditions from task statement, simply output -1 in a single line.</p>

<p>Otherwise, in the first line output the number of elements in the array and in the second line output its elements separated by spaces. The size of array must not be greater than 30 and its elements must not be greater than 10<sup>15</sup>. It is guaranteed that, if a solution exists, there is at least one satisfying those bounds.</p>

<p>If there are multiple correct solutions, output any of them.</p>