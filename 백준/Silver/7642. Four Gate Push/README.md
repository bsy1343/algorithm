# [Silver IV] Four Gate Push - 7642

[문제 링크](https://www.acmicpc.net/problem/7642)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 49, 맞힌 사람: 43, 정답 비율: 66.154%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>You are working hard on your Protoss builds in StarCraft II, especially the 4 Gate Push. You&rsquo;ve come upon a tough problem, however, which is how to determine the distribution of zealots, stalkers, and sentries to maximize your army strength. Recall (although you should already know!) that zealots cost 100 minerals and no gas, stalkers cost 125 minerals and 50 gas, and sentries cost 50 minerals and 100 gas. Given your current economy and how much each unit increases your army strength, determine the maximum army strength you can obtain.</p>

### 입력

<p>The input consists of multiple test cases, one on each line. Each test case has 5 integers M (0 &le; M &le; 50,000), the amount of minerals you have, G (0 &le; G &le; 50,000), the amount of gas you have, Z (0 &le; Z &le; 1,000), the strength of a zealot in your army, S (0 &le; S &le; 1,000), the strength of a stalker in your army, and E (0 &le; E &le; 1,000), the strength of a sentry in your army. Input is followed by a single line with M = G = Z = S = E = 0, which should not be processed.</p>

### 출력

<p>For each case, output a single line containing the maximum army strength you can obtain.</p>