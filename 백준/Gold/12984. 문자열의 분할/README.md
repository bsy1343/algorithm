# [Gold II] 문자열의 분할 - 12984

[문제 링크](https://www.acmicpc.net/problem/12984)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 13, 맞힌 사람: 10, 정답 비율: 28.571%

### 분류

(분류 없음)

### 문제 설명

<p>병찬이는 문자열 A와 B를 가지고 있다. 두 문자열이 꽤 비슷하다고 생각한 병찬이는 A 문자열에서 겹치지 않는 부분문자열을 K개 뽑아 A에서의 등장 순서대로 p<sub>1</sub>, p<sub>2</sub>, … p<sub>k</sub>라고 하고 이 모두를 포함하는 문자열 집합을 P라고 이름 붙였다. 이 문자열들은 B 문자열에서도 겹치지 않게 동일한 순서로 나타난다.</p>

<p>다음은 문자열 집합 P에 관한 설명이다.</p>

<ol>
	<li>P에 속하는 문자열은 정확히 K개이며, 모든 문자열은 길이가 1 이상이다.</li>
	<li>문자열 A는 a<sub>1</sub> p<sub>1</sub> a<sub>2</sub> p<sub>2</sub> … a<sub>k</sub> p<sub>k</sub> a<sub>k+1</sub>로 나타낼 수 있다. 이때 a<sub>1</sub>, a<sub>2</sub>, … a<sub>k+1</sub>은 각각 임의의 문자열이며, 길이가 0일 수도 있다.</li>
	<li>문자열 B는 b<sub>1</sub> p<sub>1</sub> b<sub>2</sub> p<sub>2</sub> … b<sub>k</sub> p<sub>k</sub> b<sub>k+1</sub>로 나태낼 수 있다. 이때 b<sub>1</sub>, b<sub>2</sub>, … b<sub>k+1</sub>은 각각 임의의 문자열이며, 길이가 0일 수도 있다.</li>
	<li>P에 속하는 모든 문자열의 길이의 합을 P<sub>L</sub>이라고 한다.</li>
</ol>

<p>병찬이는 이를 만족하는 P<sub>L</sub>의 최댓값을 알고싶다. 예를 들어, 문자열 A가 “bbaaaababb”이고 문자열 B가 “abbbabbaabab”라면 P<sub>L</sub>을 최대로 하는 P는 {“bba”, “aa”, “b”, “a”}로 이때 P<sub>L</sub>은 7이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12984.%E2%80%85%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%98%E2%80%85%EB%B6%84%ED%95%A0/b8cddeca.png" data-original-src="https://boja.mercury.kr/assets/problem/12984-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:346px"></p>

### 입력

<p>첫 줄에 세 개의 정수 N, M, K(1 ≤ N, M ≤ 1,000, 1 ≤ K ≤ 10)가 순서대로 주어진다. N은 문자열 A의 길이, M은 문자열 B의 길이, K는 문자열 P의 개수이다. 두 번째 줄에는 문자열 A가, 세 번째 줄에는 문자열 B가 주어진다. 모든 문자열은 영어 알파벳 소문자 26글자로만 이루어진다.</p>

### 출력

<p>한 줄에 P<sub>L</sub>의 최댓값을 출력한다. 어떤 P도 존재하지 않는 경우는 들어오지 않는다.</p>