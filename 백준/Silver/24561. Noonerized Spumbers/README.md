# [Silver III] Noonerized Spumbers - 24561

[문제 링크](https://www.acmicpc.net/problem/24561)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 36, 맞힌 사람: 33, 정답 비율: 66.000%

### 분류

수학, 문자열, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Everyone has heard of spoonerisms, named after William Archibald Spooner, an Oxford professor who had a habit of swapping prefixes of words, often with comical results. &quot;May I show you to your seat?&quot; became &quot;May I sew you to your sheet?&quot; and &quot;a crushing blow&quot; became &quot;a blushing crow.&quot;</p>

<p>Just imagine him as a student of arithmetic, occasionally swapping the prefixes of the numbers he was calculating with and then wondering why his equations never made any sense. For instance, when he writes:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/8576e247.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/8576e247.png" data-original-src="https://upload.acmicpc.net/51a71cf5-2554-40d1-8349-f55cf4600990/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 243px; height: 20px;" /></p>

<p>what he really intended to write was:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/d3790de1.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/d3790de1.png" data-original-src="https://upload.acmicpc.net/aee2b4d4-d569-40d8-87cd-246fd3a8844e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 261px; height: 20px;" /></p>

<p>(He swapped prefixes &quot;$9$&quot; and &quot;$669$&quot; in the first and third numbers.) And when he writes:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/1abf713e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/1abf713e.png" data-original-src="https://upload.acmicpc.net/130f78a4-d36a-4e6a-ab6b-83ff89d1e8b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 273px; height: 20px;" /></p>

<p>what he really intended to write was:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/13939896.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24561.%E2%80%85Noonerized%E2%80%85Spumbers/13939896.png" data-original-src="https://upload.acmicpc.net/f1d53438-c73c-4060-b9a4-aabaeb594fd6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 20px;" /></p>

<p>(He swapped the prefix &quot;$72$&quot; with the prefix &quot;$68$&quot; in the first and second numbers.)</p>

<p>Grading homework from young Mr. Spooner is quite a challenge. Fleas pined a way to help!</p>

### 입력

<p>The input consists of a single line containing an expression of the form &quot;$x + y = z$&quot; or &quot;$x * y = z$&quot;, where $x$, $y$, and $z$ are positive integers less than $2^{31}$. There will be single spaces surrounding the &quot;$+$&quot; and &quot;$*$&quot; operators and the &quot;$=$&quot; sign. The expression will not be a mathematically correct equation.</p>

### 출력

<p>Output a mathematically correct equation consisting of the input line modified by swapping proper prefixes of two of the three numbers $x$, $y$, $z$. (A proper prefix of a string $s$ is a prefix that is neither empty nor equal to $s$.) Separate the numbers, operators, and the &quot;$=$&quot; sign with single spaces. All integers in the correct equation will be non-negative and less than $2^{31}$. There is guaranteed to be only one possible correct equation that can be formed by swapping proper prefixes.</p>