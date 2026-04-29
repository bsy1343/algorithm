# [Bronze I] Knowing the Clock - 35214

[문제 링크](https://www.acmicpc.net/problem/35214)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 38, 정답: 34, 맞힌 사람: 32, 정답 비율: 88.889%

### 분류

브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>It is the 25th of November, 1625. You have put a lot of time into making a mechanical watch, but you are unsure if the hands are placed correctly. Even a watch that is not running is correct twice a day, but if the hands of the watch do not correspond to a real time, it is never correct at all. Without wasting any more time, you measure the angles of the hands and check whether they correspond to a real time.</p>

<p>For example, consider the first sample input, visualized in Figure K.1: if the minute hand points to a quarter past (90 degrees from 12 o'clock), then the hour hand cannot point exactly to 2 o'clock (60 degrees from 12 o'clock).</p>

<p>You know that both hands of the watch are moving continuously.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35214.%E2%80%85Knowing%E2%80%85the%E2%80%85Clock/7fadd8cb.png" data-original-src="https://boja.mercury.kr/assets/problem/35214-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35214.%E2%80%85Knowing%E2%80%85the%E2%80%85Clock/fdf86844.png" data-original-src="https://boja.mercury.kr/assets/problem/35214-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35214.%E2%80%85Knowing%E2%80%85the%E2%80%85Clock/3799b5ad.png" data-original-src="https://boja.mercury.kr/assets/problem/35214-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35214.%E2%80%85Knowing%E2%80%85the%E2%80%85Clock/752dd91f.png" data-original-src="https://boja.mercury.kr/assets/problem/35214-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 200px;"></p>

<p style="text-align: center;">Figure K.1: Illustrations of the sample inputs. The first and third sample inputs <em>do not</em> correspond to a real time. The second and fourth sample inputs <em>do</em> correspond to a real time.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $h$ and $m$ ($0 \leq h, m \leq 359$), the exact clockwise angle that the hour hand is from 12 o'clock and the exact clockwise angle that the minute hand is from 12 o'clock. Both angles are given in degrees.</li>
</ul>

### 출력

<p>If the angles of the hands correspond to a real time, output "<code>yes</code>". Otherwise, output "<code>no</code>".</p>