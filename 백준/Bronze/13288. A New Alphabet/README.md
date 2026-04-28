# [Bronze II] A New Alphabet - 13288

[문제 링크](https://www.acmicpc.net/problem/13288)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 514, 정답: 298, 맞힌 사람: 237, 정답 비율: 56.429%

### 분류

구현, 문자열

### 문제 설명

<p>A New Alphabet has been developed for Internet communications. While the glyphs of the new alphabet don&rsquo;t necessarily improve communications in any meaningful way, they certainly make us feel cooler.</p>

<p>You are tasked with creating a translation program to speed up the switch to our more elite New Alphabet by automatically translating ASCII plaintext symbols to our new symbol set.</p>

<p>The new alphabet is a one-to-many translation (one character of the English alphabet translates to anywhere between 1 and 6 other characters), with each character translation as follows:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13288.%E2%80%85A%E2%80%85New%E2%80%85Alphabet/e3b82021.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13288/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-30%20%EC%98%A4%ED%9B%84%206.40.21.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:258px; width:630px" /></p>

<p>For instance, translating the string &ldquo;Hello World!&rdquo; would result in:</p>

<p>[-]3110 \/\/0|Z1|)!</p>

<p>Note that uppercase and lowercase letters are both converted, and any other characters remain the same (the exclamation point and space in this example).</p>

### 입력

<p>Input contains one line of text, terminated by a newline. The text may contain any characters in the ASCII range 32&ndash;126 (space through tilde), as well as 9 (tab). Only characters listed in the above table (A&ndash;Z, a&ndash;z) should be translated; any non-alphabet characters should be printed (and not modified). Input has at most 10 000 characters.</p>

### 출력

<p>Output the input text with each letter (lowercase and uppercase) translated into its New Alphabet counterpart.</p>