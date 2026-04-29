# [Silver V] 문자열 회전 - 35429

[문제 링크](https://www.acmicpc.net/problem/35429)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 207, 정답: 157, 맞힌 사람: 148, 정답 비율: 78.723%

### 분류

문자열, 애드 혹

### 문제 설명

<p><a href="/problem/1845"><em>배열 회전</em></a>을 성공적으로 끝낸 승원이는 이제 <strong>문자열 회전</strong>을 하려고 한다. 알파벳 대문자로만 이루어진 길이 $N$의 문자열 $S$가 주어질 때, <strong>문자열 회전</strong>을 최대 $N$번 시행해 $S$에 존재하는 부분 문자열 <span style="color:#e74c3c;"><code>GSHS</code></span>의 개수를 최대로 만들려고 한다.</p>

<p><strong>문자열 회전</strong>이란 다음과 같다:</p>

<ul>
<li>$1 \le l \le r \le N$을 만족하는 정수 $l$과 $r$을 고른다.</li>
<li>그 뒤, $S$의 $i$번째 문자를 $a_i$라 할 때, $a_l, a_{l+1}, a_{l+2}, \cdots, a_{r-1}, a_r$을 $a_r, a_{r-1}, a_{r-2}, \cdots, a_{l+1}, a_l$로 바꾼다.</li>
</ul>

<p>부분 문자열의 정의는 아래 노트를 참고하라.</p>

### 입력

<p>첫 번째 줄에 문자열의 길이 $N$이 주어진다.</p>

<p>두 번째 줄에 알파벳 대문자로만 이루어진 문자열 $S$가 주어진다.</p>

### 출력

<p>첫 번째 줄에 만들 수 있는 부분 문자열 <span style="color:#e74c3c;"><code>GSHS</code></span>의 최대 개수를 출력하라.</p>

### 제한

<ul>
<li>$ 1 \le N \le 10^6 $</li>
<li>$S$는 알파벳 대문자로만 이루어져 있음</li>
</ul>

### 힌트

<p>문자열 $S$의 부분 문자열이란, $S$의 왼쪽 끝과 오른쪽 끝에서 $0$개 이상의 문자를 제거해서 만들 수 있는 문자열을 의미한다. 예를 들어 <span style="color:#e74c3c;"><code>GSHSSSHS</code></span>의 부분 문자열로는 <span style="color:#e74c3c;"><code>GSHS</code></span>, <span style="color:#e74c3c;"><code>SSHS</code></span>, <span style="color:#e74c3c;"><code>HSSSH</code> </span>등이 있고, 부분 문자열이 아닌 것으로는 <span style="color:#e74c3c;"><code>GH</code></span>, <span style="color:#e74c3c;"><code>A</code></span>, <span style="color:#e74c3c;"><code>HSH</code> </span>등이 있다.</p>