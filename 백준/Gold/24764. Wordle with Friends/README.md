# [Gold IV] Wordle with Friends - 24764

[문제 링크](https://www.acmicpc.net/problem/24764)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 24, 맞힌 사람: 21, 정답 비율: 36.207%

### 분류

구현, 시뮬레이션, 문자열

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24764.%E2%80%85Wordle%E2%80%85with%E2%80%85Friends/210daa87.png" data-original-src="https://upload.acmicpc.net/81accc5d-c9b5-4945-8351-d1fca9660cbb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 378px; height: 157px;" /></p>

<p>Zoe and her friends enjoy playing Wordle (<a href="https://www.nytimes.com/games/wordle/">Wordle</a> was created by Josh Wardle, and is now owned by the New York Times.) together and have decided to work cooperatively to solve the daily puzzle.</p>

<p>Wordle is a game where players get six attempts to guess a hidden 5-letter word. &nbsp;With each word guessed, the system will mark each letter with one of three feedback colors:</p>

<ol>
	<li><code>Green</code> - this letter is in the word and occurs at this location.</li>
	<li><code>Yellow</code> - this letter is in the word, but not at this location.</li>
	<li><code>Gray</code> - this letter is not in the hidden word (with an exception for duplicate letters, see below).</li>
</ol>

<p>Note that duplicate letters can be a little tricky. First, <code>Green</code> letters are marked. For a single letter, suppose there are $X$ non-<code>Green</code> occurrences in the hidden word and $Y$ non-<code>Green</code> occurrences in the guess. The <em>leftmost</em> $\min(X,Y)$ of the non-<code>Green</code> occurrences of this letter will be marked <code>Yellow</code> and the rest will be <code>Gray</code>.</p>

<p>For example, if the hidden word was <code>FREED</code> and a guessed word was <code>GEESE</code>, the feedback would show the second <code>E</code> (the third letter) in <code>Green</code>, and the first and third <code>E</code>s (second and fifth letters of <code>GEESE</code>) respectively in <code>Yellow</code> and <code>Gray</code>.</p>

<p>Knowing the list of all guessable words, help Zoe determine which words are still valid given their original guesses.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1 \leq N \leq 10$), which is the number of guesses Zoe and her friends have made, and $W$ ($1 \leq W \leq 10^4$), which is the number of guessable words.</p>

<p>The next $N$ lines describe the guesses. Each line contains two 5-letter strings $g$ and $f$. The first string, $g$, is the guess which consists only of uppercase English letters and is in the list of guessable words. The second string, $f$, is the feedback. The feedback is composed of the characters <code>G</code>, <code>Y</code>, and <code>-</code>, respectively indicating <code>Green</code>, <code>Yellow</code>, and <code>Gray</code> for the guess.</p>

<p>The last $W$ lines describe the list of distinct guessable words. Each line contains a 5-letter string of uppercase English letters.</p>

### 출력

<p>Display all valid words, in the order they appear, from the guessable list of words. There will always be at least one valid word.</p>