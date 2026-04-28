# [Gold I] '한국디지털미디어고등학교'는 너무 길다. - 32189

[문제 링크](https://www.acmicpc.net/problem/32189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 277, 정답: 100, 맞힌 사람: 85, 정답 비율: 49.133%

### 분류

다이나믹 프로그래밍, 문자열, 애드 혹, 최장 공통 부분 수열 문제

### 문제 설명

<p>디미고의 공식 명칭인 &#39;한국디지털미디어고등학교&#39;는 너무 길다. 그래서 한국디지털미디어고등학교를 문과 계열의 디지털콘텐츠과와 이비지니스과 학교, 이과 계열의 웹프로그래밍과와 해킹방어과 학교 즉, 문과 학교와 이과 학교 둘로 나누어 학교 이름을 줄이려 한다. 학생회는 나눈 두 학교의 이름을 새로 지어야 한다.</p>

<p>학생회는 한국디지털미디어고등학교의 정체성을 지키기 위해 두 학교의 이름을 원래 학교 이름의 연속된 앞부분과 나머지 뒷부분으로 나누어 정하기로 했다. 예를 들어 &quot;<code style="color:#e74c3c;">KoreaDigitalMediaHighSchool</code>&quot;을 앞부분 &quot;<code style="color:#e74c3c;">KoreaDigital</code>&quot;과 뒷부분 &quot;<code style="color:#e74c3c;">MediaHighSchool</code>&quot;으로 나눌 수 있다. 또한 앞부분 또는 뒷부분이 빈 문자열이어도 된다.</p>

<p>이때 문과 계열과 이과 계열은 서로 라이벌 의식을 가지고 있기 때문에 나누어진 두 학교의 이름이 최대한 달랐으면 했다. 학생회는 이를 객관적으로 판단하기 위해 불일치도라는 값을 사용하기로 했다. 불일치도는 학교 이름을 나눈 두 문자열을 각각 $A$, $B$라고 했을 때 $\mathrm{min}(|A|, |B|) - \mathrm{LCS}(A, B)$이다. 문자열 $S$에 대해 $|S|$는 $S$의 길이를 의미하며, $\mathrm{min}(x, y)$는 $x$와 $y$ 중 크지 않은 수를 의미한다.</p>

<p>$\mathrm{LCS}(A, B)$는 대소문자를 구분하여 $A$, $B$ 모두의 부분 문자열이 되는 문자열 중 가장 긴 문자열의 길이이다. 예를 들면, &quot;<code style="color:#e74c3c;">ABCD</code>&quot;와 &quot;<code style="color:#e74c3c;">ABDF</code>&quot;의 공통 부분 문자열 중 가장 긴 문자열은 &quot;<code style="color:#e74c3c;">ABD</code>&quot;로 $\mathrm{LCS}($&quot;<code style="color:#e74c3c;">ABCD</code>&quot;$,$ &quot;<code style="color:#e74c3c;">ABDF</code>&quot;$)$는 $3$이다. 부분 문자열은 원래 문자열에서 순서를 유지하면서 $0$개 이상의 문자를 제거해 만든 문자열이다. 예를 들어, &quot;<code><span style="color:#e74c3c;">ABC</span></code>&quot;, &quot;<code><span style="color:#e74c3c;">BD</span></code>&quot;는 &quot;<code><span style="color:#e74c3c;">ABCD</span></code>&quot;의 부분 문자열이지만 &quot;<code><span style="color:#e74c3c;">BDC</span></code>&quot;, &quot;<code><span style="color:#e74c3c;">EAB</span></code>&quot;, &quot;<code><span style="color:#e74c3c;">abc</span></code>&quot;는 아니다.</p>

<p>한국디지털미디어고등학교를 잘 나눌 수 있도록 가능한 불일치도의 최댓값을 구하자.</p>

### 입력

<p>첫 번째 줄에 학교 이름을 나타내는 문자열 $S$가 주어진다. $S$는 알파벳 소문자와 대문자로만 이루어져 있다. $(1 \leq |S| \leq 3\,000)$</p>

### 출력

<p>첫 번째 줄에 불일치도의 최댓값을 출력한다.</p>