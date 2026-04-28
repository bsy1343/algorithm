# [Gold III] Lunch - 31363

[문제 링크](https://www.acmicpc.net/problem/31363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 2, 맞힌 사람: 2, 정답 비율: 13.333%

### 분류

많은 조건 분기

### 문제 설명

<p>The swamp looks like a narrow lane with length $n$ covered by floating leaves sized $1$, numbered from $1$ to $n$ with a fly sitting on the top of each. A little toad is sitting on one of the leaves instead of a fly. Its name is Kvait and it is about to have lunch. It can jump to the bordering leaf or jump it over to the next one in any direction. When landing it eats a fly. Kvait is already quite a big toad and the leaves are unstable so when it jumps away the leaf starts sinking.</p>

<p>In order to have lunch Kvait needs to eat all of the flies. It starts his journey from the leaf with number $s$ and has to finish on the leaf with number $f$. Yet jumping to the bordering leaf takes more Kvait&rsquo;s energy than skipping a leaf over. It is necessary to plan the toad&rsquo;s movements to get lunch with minimal energy spent.</p>

### 입력

<p>Single line contains three integers $n$, $s$, $f$ ($2 \le n \le 10\,000$, $1 \le s, f \le n$) --- the number of leaves, number of a starting leaf and the number of the finish leaf respectively.</p>

### 출력

<p>Output the minimal number of jumps to the bordering leaves required for the toad to have lunch. If there is no way to eat up, output a single number $-1$.</p>