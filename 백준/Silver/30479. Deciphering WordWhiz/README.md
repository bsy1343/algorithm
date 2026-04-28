# [Silver II] Deciphering WordWhiz - 30479

[문제 링크](https://www.acmicpc.net/problem/30479)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 65, 맞힌 사람: 59, 정답 비율: 81.944%

### 분류

구현, 문자열

### 문제 설명

<p>WordWhiz is a popular word puzzle game that challenges players to guess a secret word within a limited number of attempts. The game uses a dictionary containing N words. Each word in this dictionary consists of five distinct lowercase letters.</p>

<p>The game begins with the player being presented with an empty grid, consisting of a number of rows. Each row allows a single guess. The player&rsquo;s task is to fill rows with words contained in the dictionary until the secret word is found, or the player has used all available rows.</p>

<p>After the player submits a guess, the game provides feedback by coloring the cells where the guess was written. The feedback consists of three colors:</p>

<ul>
	<li>Gray (&ldquo;X&rdquo;): The letter in the cell is not part of the secret word.</li>
	<li>Yellow (&ldquo;!&rdquo;): The letter in the cell is part of the secret word but is in the wrong position.</li>
	<li>Green (&ldquo;*&rdquo;): The letter in the cell is part of the secret word and is in the correct position.</li>
</ul>

<p>To illustrate, let&rsquo;s consider the scenario where the secret word is &ldquo;hotel&rdquo;, and the player submits &ldquo;blast&rdquo; as their guess. In this case, the first, third, and fourth cells would turn gray because &ldquo;b&rdquo;, &ldquo;a&rdquo;, and &ldquo;s&rdquo; are not present in the secret word &ldquo;hotel&rdquo;. The second and fifth cells, however, would turn yellow. This indicates that &ldquo;l&rdquo; and &ldquo;t&rdquo; are part of the secret word but appear in wrong positions: &ldquo;l&rdquo; should be in the fifth position instead of the second, while &ldquo;t&rdquo; should be in the third position instead of the fifth. This feedback would be represented by &ldquo;X!XX!&rdquo;.</p>

<p>Now, if the player submits &ldquo;heart&rdquo; as their guess, the third and fourth cells would still turn gray, because &ldquo;a&rdquo; and &ldquo;r&rdquo; are not in &ldquo;hotel&rdquo;. The second and fifth cells would again turn yellow, because once more &ldquo;t&rdquo; is in the fifth position (instead of the third), and this time &ldquo;e&rdquo; is in the second position when it should be in the fourth. However, for this guess the first cell would turn green, indicating that &ldquo;h&rdquo; is the first letter in both the guess &ldquo;heart&rdquo; and the secret word &ldquo;hotel&rdquo;. This feedback would be represented by &ldquo;*!XX!&rdquo;.</p>

<p>Finally, if the player submits &ldquo;hotel&rdquo; as their guess, all cells would turn green since this is the secret word. This feedback would be represented by &ldquo;*****&rdquo;.</p>

<p>The feedbacks above can be seen in the following picture.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30479.%E2%80%85Deciphering%E2%80%85WordWhiz/35e7a0be.png" data-original-src="https://upload.acmicpc.net/f8b284b0-545d-482b-8011-8690f0e1d85f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 181px; height: 146px;" /></p>

<p>Some time ago, your company added a WordWhiz player on its website and now wants to enhance the game by adding functionality to display previous game sessions. However, only the feedback for each guess was stored, not the submitted words. This means that it might not be possible to accurately recover the guesses submitted in each session, and before investing any further effort, the company wants to analyze the recorded game sessions.</p>

<p>Given a dictionary of five-letter words, the secret word (included in the dictionary) and the feedback for a game session, your task is to determine how many words in the dictionary could have been submitted as each guess.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 1000) indicating the number of words in the dictionary.</p>

<p>Each of the next N lines contains a string representing a word in the dictionary. All strings are different and each of them consists of five different lowercase letters. The first string is the secret word for the game session.</p>

<p>The next line contains an integer G (1 &le; G &le; 10) indicating the number of guesses during the game session.</p>

<p>Each of the next G lines contains a five-character string representing the feedback for a guess. The feedback string contains only the characters &ldquo;X&rdquo;, &ldquo;!&rdquo; and &ldquo;*&rdquo;, indicating respectively gray, yellow and green colors.</p>

<p>It is guaranteed that the input describes a valid game session.</p>

### 출력

<p>Output G lines, such that the i-th contains an integer indicating how many words in the dictionary could have been submitted on the i-th guess.</p>