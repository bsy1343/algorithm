# [Platinum III] a11y - 32167

[문제 링크](https://www.acmicpc.net/problem/32167)

### 성능 요약

시간 제한: 3.5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 167, 정답: 100, 맞힌 사람: 58, 정답 비율: 56.311%

### 분류

비트 집합

### 문제 설명

<p>당신은 a11y라는 단어를 들어본 적이 있는가? 이는 <strong>a</strong>ccessibilit<strong>y</strong> (접근성)을 줄인 축약어로, <strong>a</strong>와 <strong>y</strong> 사이 11개의 문자가 있는 것을 뜻한다. 이와 비슷한 축약어로 k8s (<strong>K</strong>ubernete<strong>s</strong>), i18n (<strong>i</strong>nternationalizatio<strong>n</strong>) 등이 있다.</p>

<p>길이 $N$인 문자열 $A$가 있다. 알파벳, 수, 알파벳으로 이루어진 축약어가 쿼리로 주어질 때, 이와 매칭되는 $A$의 부분문자열이 몇 개 있는지 출력하여라. 개수를 셀 때는 같은 문자열이더라도 $A$에서의 위치가 다르면 다른 것으로 친다.</p>

<p>어떤 문자열의 부분문자열이란, 문자열의 양 끝에서 문자를 $0$개 이상 지워서 만들 수 있는 문자열을 뜻한다. 예를 들어, <span style="color:#e74c3c;"><code>abc</code></span>의 부분문자열은 <span style="color:#e74c3c;"><code>a</code></span>, <span style="color:#e74c3c;"><code>b</code></span>, <span style="color:#e74c3c;"><code>c</code></span>, <span style="color:#e74c3c;"><code>ab</code></span>, <span style="color:#e74c3c;"><code>bc</code></span>, <span style="color:#e74c3c;"><code>abc</code></span>로 $6$개가 있다.</p>

### 입력

<p>첫 번째 줄에 알파벳 소문자로만 이루어진 길이가 $N$인 문자열 $A$가 주어진다. ($1\le N\le 100\,000$)</p>

<p>다음 줄에 쿼리의 수 $Q$가 주어진다. ($1\le Q\le 100\,000$)</p>

<p>그다음 $Q$개의 줄에 축약어가 문자, 수, 문자 형태로 공백 없이 주어진다. 이때 두 문자는 알파벳 소문자이며, 가운데 수는 $1$ 이상 $N-2$ 이하이다.</p>

### 출력

<p>$Q$개의 줄에 쿼리의 답을 차례로 출력한다.</p>