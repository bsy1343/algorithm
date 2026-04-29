# [Gold V] 스택과 팰린드롬 - 35412

[문제 링크](https://www.acmicpc.net/problem/35412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 178, 정답: 103, 맞힌 사람: 94, 정답 비율: 66.197%

### 분류

그리디 알고리즘, 문자열, 스택, 애드 혹, 자료 구조

### 문제 설명

<p>길이 $N$의 문자열 $S$와 비어 있는 문자열 $R$이 주어질 때 다음 과정을 $S$가 비어있을 때까지 반복하여 적용한 뒤의 $R$을 구하여라.</p>

<ol>
<li>$S$의 맨 앞 글자를 삭제한 뒤 삭제한 글자를 $R$의 맨 뒤에 추가한다.</li>
<li>이후 $R$에 길이 $2$ 이상의 팰린드롬 부분 문자열이 있다면 그중 가장 긴 문자열을 $R$에서 삭제한다. 만약 가장 긴 팰린드롬 부분 문자열이 여럿 있다면 그중 가장 앞에 있는 문자열을 삭제한다.</li>
<li>2번 단계를 $R$에 길이 $2$ 이상의 팰린드롬 부분 문자열이 없을 때까지 반복한다.</li>
</ol>

### 입력

<p>첫 번째 줄에 문자열 $S$의 길이 $N$이 주어진다. $(1 \le N \le 5\times 10^5)$</p>

<p>두 번째 줄에 알파벳 소문자로만 이루어진 문자열 $S$가 주어진다.</p>

### 출력

<p>첫 번째 줄에 문제에서 설명한 과정을 모두 적용한 뒤의 $R$을 출력한다. 단, 모든 과정을 적용한 뒤 $R$이 비어있다면 <span style="color:#e74c3c;"><code>-1</code></span>을 대신 출력한다.</p>

### 힌트

<p>문자열 $A$가 문자열 $B$의 연속된 부분으로 나타난다면 $A$를 $B$의 부분 문자열이라고 한다. 예로 <span style="color:#e74c3c;"><code>di</code></span>, <span style="color:#e74c3c;"><code>m</code></span>, <span style="color:#e74c3c;"><code>dimi</code></span>는 <span style="color:#e74c3c;"><code>dimi</code></span>의 부분 문자열이지만 <span style="color:#e74c3c;"><code>a</code></span>, <span style="color:#e74c3c;"><code>ii</code></span>, <span style="color:#e74c3c;"><code>mid</code></span>는 <span style="color:#e74c3c;"><code>dimi</code></span>의 부분 문자열이 아니다.</p>

<p>문자열 $A$를 앞에서부터 읽어도 뒤에서부터 읽어도 같다면 $A$를 팰린드롬이라고 한다. 예로 <span style="color:#e74c3c;"><code>a</code></span>, <span style="color:#e74c3c;"><code>sees</code></span>, <span style="color:#e74c3c;"><code>racecar</code></span>는 팰린드롬이지만 <span style="color:#e74c3c;"><code>cab</code></span>, <span style="color:#e74c3c;"><code>dimi</code></span>, <span style="color:#e74c3c;"><code>palindrome</code></span>은 팰린드롬이 아니다.</p>