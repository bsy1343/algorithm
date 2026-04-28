# [Bronze II] Ресторан - 23738

[문제 링크](https://www.acmicpc.net/problem/23738)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 1178, 정답: 821, 맞힌 사람: 760, 정답 비율: 71.902%

### 분류

구현, 문자열

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/23738.%E2%80%85%D0%A0%D0%B5%D1%81%D1%82%D0%BE%D1%80%D0%B0%D0%BD/db5c52fa.png" data-original-src="https://upload.acmicpc.net/501a7239-fd42-4c48-bb70-2993062b6b0a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 630px; max-width: 100%;" /></p>

<p style="text-align: center;">그림 A.1:&nbsp;Ресторан &laquo;Матрешка&raquo;</p>

<p>팀 레드시프트를 따라 모스크바 여행에 간 한별이는 거리에 늘어선 &lsquo;<span style="color:#3498db;">Ресторан</span>&rsquo;가 적힌 간판들을 보고 어떤 가게일까 고민하기 시작했다.</p>

<p>러시아어 알파벳에는 영어 알파벳과 비슷하게&nbsp;생긴 글자들이 있는데, <span style="color:#3498db;">А</span>, <span style="color:#3498db;">В</span>, <span style="color:#3498db;">Е</span>, <span style="color:#3498db;">К</span>, <span style="color:#3498db;">М</span>, <span style="color:#3498db;">Н</span>, <span style="color:#3498db;">О</span>, <span style="color:#3498db;">Р</span>, <span style="color:#3498db;">С</span>, <span style="color:#3498db;">Т</span>, <span style="color:#3498db;">У</span>, <span style="color:#3498db;">Х</span>의 $12$가지가 있다. <span style="color:#3498db;">А</span>,&nbsp;<span style="color:#3498db;">К</span>, <span style="color:#3498db;">М</span>,&nbsp;<span style="color:#3498db;">О</span>,&nbsp;<span style="color:#3498db;">Т</span>의 다섯 글자는 보이는 대로 읽으면 되지만, 나머지 $7$가지 글자는 영어 알파벳의 발음과&nbsp;다르게 읽어야 한다!</p>

<ul>
	<li>&lsquo;<span style="color:#3498db;">В</span>&rsquo;는 &lsquo;B&rsquo;처럼 보이지만 &lsquo;v&rsquo;로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">Е</span>&rsquo;는 &lsquo;E&rsquo;처럼 보이지만 &lsquo;ye&rsquo;로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">Н</span>&rsquo;은&nbsp;&lsquo;H&rsquo;처럼 보이지만 &lsquo;n&rsquo;으로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">Р</span>&rsquo;은&nbsp;&lsquo;P&rsquo;처럼 보이지만 &lsquo;r&rsquo;으로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">С</span>&rsquo;는 &lsquo;C&rsquo;처럼 보이지만 &lsquo;s&rsquo;로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">У</span>&rsquo;는 &lsquo;Y&rsquo;처럼 보이지만 &lsquo;u&rsquo;로 읽는다.</li>
	<li>&lsquo;<span style="color:#3498db;">Х</span>&rsquo;는 &lsquo;X&rsquo;처럼 보이지만 &lsquo;h&rsquo;로 읽는다.</li>
</ul>

<p>고민에 빠진 한별이를 위해&nbsp;<span style="color:#3498db;">Ресторан</span>가 무슨 가게인지 알려 주자.</p>

### 입력

<p>최대 $100$글자의 단어가 주어진다. 모든 글자는 <strong>영어</strong> 대문자 A, B, E, K, M, H, O, P, C, T, Y, X 중 하나로 이루어져 있다. 입력이 러시아어 대문자로 주어지지 않음에 주의하자.</p>

### 출력

<p>입력으로 주어진 단어를 비슷한 러시아어 알파벳으로 읽었을 때, 어떤 발음이 되는지 영어 소문자로 나타내 출력한다.</p>