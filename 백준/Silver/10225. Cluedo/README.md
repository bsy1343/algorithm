# [Silver IV] Cluedo - 10225

[문제 링크](https://www.acmicpc.net/problem/10225)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 101, 정답: 50, 맞힌 사람: 44, 정답 비율: 49.438%

### 분류

구현

### 문제 설명

<p>Dr. Black has been murdered. Detective Jill must determine the murderer, the location, and the weapon. There are six possible murderers, numbered 1 to 6. There are ten possible locations, numbered 1 to 10. There are six possible weapons, numbered 1 to 6.</p>

<p>For illustration only, we show the names of the possible murderers, locations and weapons. The names are not required to solve the task.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Murderer</th>
			<th>Location</th>
			<th>Weapon</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
			<ol>
				<li>Professor Plum</li>
				<li>Miss Scarlet</li>
				<li>Colonel Mustard</li>
				<li>Mrs. White</li>
				<li>Reverend Green</li>
				<li>Mrs. Peacock</li>
			</ol>
			</td>
			<td>
			<ol>
				<li>Ballroom</li>
				<li>Kitchen</li>
				<li>Conservatory</li>
				<li>Dining Room</li>
				<li>Billiard Room</li>
				<li>Library</li>
				<li>Lounge</li>
				<li>Hall</li>
				<li>Study</li>
				<li>Cellar</li>
			</ol>
			</td>
			<td>
			<ol>
				<li>Lead pipe</li>
				<li>Dagger</li>
				<li>Candlestick</li>
				<li>Revolver</li>
				<li>Rope</li>
				<li>Spanner</li>
			</ol>
			</td>
		</tr>
	</tbody>
</table>

<p>Jill repeatedly tries to guess the correct combination of murderer, location and weapon. Each guess is called a&nbsp;<i>theory</i>. She asks her assistant Jack to confirm or to refute each theory in turn. When Jack confirms a theory, Jill is done. When Jack refutes a theory, he reports to Jill that one of the murderer, location or weapon is wrong.</p>

<p>You are to implement the procedure&nbsp;<b>Solve</b>&nbsp;that plays Jill&#39;s role. The grader will call&nbsp;<b>Solve</b>&nbsp;many times, each time with a new case to be solved.&nbsp;<b>Solve</b>&nbsp;must repeatedly call&nbsp;<b>Theory(M,L,W)</b>, which is implemented by the grader. M, L and W are numbers denoting a particular combination of murderer, location and weapon.&nbsp;<b>Theory(M,L,W)</b>&nbsp;returns 0 if the theory is correct. If the theory is wrong, a value of 1, 2 or 3 is returned. 1 indicates that the murderer is wrong; 2 indicates that the location is wrong; 3 indicates that the weapon is wrong. If more than one is wrong, Jack picks one arbitrarily between the wrong ones (not necessarily in a deterministic way). When&nbsp;<b>Theory(M,L,W)</b>&nbsp;returns 0,&nbsp;<b>Solve</b>&nbsp;should return.</p>

### 입력



### 출력

