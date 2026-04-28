# [Silver II] Kotlin Island - 15141

[문제 링크](https://www.acmicpc.net/problem/15141)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 49, 맞힌 사람: 48, 정답 비율: 60.759%

### 분류

해 구성하기

### 문제 설명

<p>There is an urban myth that Peter the Great wanted to make a rectangular channel-grid engineering masterpiece not only from Vasilyevskiy island, but also from Kotlin island (where the town of Kronstadt is located nowadays).</p>

<p>The following mathematical model was (allegedly) presented to the tsar. The island is considered a rectangular grid h cells high and w cells wide. Each cell is dry land initially but can become water.</p>

<p>Technologies of those days allowed engineers to dig a channel across the entire island. In that case an entire row or an entire column of cells became water. If some of these cells already were water, their status did not change.</p>

<p>Your task is to propose a plan of the island which has exactly n connected components of dry land cells.</p>

### 입력

<p>The only line of the input contains three integers h, w, and n &mdash; grid&rsquo;s height, width and the desired number of connected components (1 &le; h, w &le; 100; 1 &le; n &le; 10<sup>9</sup>).</p>

### 출력

<p>If there is no valid plan containing n connected components, output a single word &ldquo;Impossible&rdquo;.</p>

<p>Otherwise output h lines of length w depicting the plan. Dot (&lsquo;.&rsquo;) represents a dry land cell, hash (&lsquo;#&rsquo;) represents a water cell.</p>