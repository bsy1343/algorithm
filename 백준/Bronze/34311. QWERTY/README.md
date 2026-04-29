# [Bronze I] QWERTY - 34311

[문제 링크](https://www.acmicpc.net/problem/34311)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 86, 정답: 81, 맞힌 사람: 69, 정답 비율: 94.521%

### 분류

구현, 문자열

### 문제 설명

<p>Riley is a very fast typist. She can easily reach $180$ words per minute (WPM) without looking at the keyboard. Her muscle memory is accustomed to the standard QWERTY keyboard layout (Figure 1). Unfortunately, she didn't realize that the keyboard she was typing on was actually the ABCDEF layout (Figure 2), so her message looks like gibberish.</p>

<p>For example, if her message read <code>visidkmi lvpiis in zhycl</code>, then what she actually wanted to type was <code>colorado school of mines</code>. Note that the space key is in the same position on both keyboards. This example corresponds to Sample Input 1.</p>

<p>Given an arbitrary message, can you figure out what Riley was trying to type?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34311.%E2%80%85QWERTY/bee38a63.png" data-original-src="https://boja.mercury.kr/assets/problem/34311-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 175px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong>: The standard QWERTY layout that Riley thought she was using. Made with <a href="http://www.keyboard-layout-editor.com">www.keyboard-layout-editor.com</a>.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34311.%E2%80%85QWERTY/bedcbf4a.png" data-original-src="https://boja.mercury.kr/assets/problem/34311-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 175px;"></p>

<p style="text-align: center;">Figure 2: The ABCDEF layout keyboard that Riley actually used. Made with <a href="http://www.keyboard-layout-editor.com">www.keyboard-layout-editor.com</a>.</p>

### 입력

<p>The first line of input is an integer, $1 \leq N \leq 1\,000$, corresponding to the number of characters in the second line.</p>

<p>The second line of input is the text Riley typed with the ABCDEF keyboard. It is guaranteed to contain only the lowercase letters <code>a</code>--<code>z</code> and the space character.</p>

### 출력

<p>Your output should be a single line: the text Riley was trying to type.</p>