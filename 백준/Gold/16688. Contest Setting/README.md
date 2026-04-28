# [Gold III] Contest Setting - 16688

[문제 링크](https://www.acmicpc.net/problem/16688)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB (추가 메모리 없음)

### 통계

제출: 106, 정답: 74, 맞힌 사람: 71, 정답 비율: 78.022%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 값 / 좌표 압축

### 문제 설명

<p>A group of contest writers have written n problems and want to use k of them in an upcoming contest. Each problem has a difficulty level. A contest is valid if all of its k problems have different difficulty levels.</p>

<p>Compute how many distinct valid contests the contest writers can produce. Two contests are distinct if and only if there exists some problem present in one contest but not present in the other.</p>

<p>Print the result modulo 998,244,353.</p>

### 입력

<p>The first line of input contains two space-separated integers n and k (1 &le; k &le; n &le; 1000).</p>

<p>The next line contains n space-separated integers representing the difficulty levels. The difficulty levels are between 1 and 10<sup>9</sup> (inclusive).</p>

### 출력

<p>Print the number of distinct contests possible, modulo 998,244,353.</p>