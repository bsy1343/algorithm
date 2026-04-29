# [Bronze III] 가희와 부역명 - 32778

[문제 링크](https://www.acmicpc.net/problem/32778)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 853, 정답: 544, 맞힌 사람: 485, 정답 비율: 68.794%

### 분류

문자열, 파싱

### 문제 설명

<p>지하철역 중에, 역 이름 뒤에 다른 이름 부역명이 괄호 안에 붙은 것을 종종 볼 수 있습니다. 예를 들어, 숭실대입구역은 부역명으로 살피재가 붙습니다. 역 정보가 주어졌을 때, 역명과 부역명을 출력해 주세요.</p>

### 입력

<p>첫 번째 줄에 역 정보가 주어집니다. 역 정보는 아래 두 형식 중 하나로 주어집니다.</p>

<ul>
	<li>{<code>station_name</code>}</li>
	<li>{<code>station_name</code>} {<code>open_character</code>}{<code>sub_station_name</code>}{<code>close_character</code>}</li>
</ul>

<p><code>station_name</code>은 역명을, <code>sub_station_name</code>은 부역명을 의미합니다.</p>

<p>또한, 두 번째 형식으로 주어지는 경우, <code>open_character</code>는 '<span style="color:#e74c3c;"><code>(</code></span>'로, <code>close_character</code>는 '<span style="color:#e74c3c;"><code>)</code></span>'로 주어집니다.</p>

### 출력

<p>첫 번째 줄에 역명을, 두 번째 줄에 부역명을 출력해 주세요. 만약, 부역명이 없다면, 부역명을 출력할 때 '<span style="color:#e74c3c;"><code>-</code></span>'를 출력해 주세요.</p>

### 제한

<p><code>station_name</code>과 <code>sub_station_name</code>은 아래를 만족합니다.</p>

<ul>
	<li>알파벳 대소문자와 대시 '<span style="color:#e74c3c;"><code>-</code></span>', 숫자, 공백 문자로만 주어집니다.</li>
	<li>공백 문자가 연속으로 들어오지 않으며, 공백 문자로 시작하거나 끝나지 않습니다.</li>
	<li>길이는 $2$ 이상 $50$ 이하입니다.</li>
</ul>