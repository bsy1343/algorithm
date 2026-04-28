# [Platinum IV] Go with the Flow - 15694

[문제 링크](https://www.acmicpc.net/problem/15694)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 46, 맞힌 사람: 39, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In typesetting, a &ldquo;river&rdquo; is a string of spaces formed by gaps between words that extends down several lines of text. For instance, Figure F.1 shows several examples of rivers highlighted in red (text is intentionally blurred to make the rivers more visible).</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15694/1.png" style="width: 431px; height: 123px;" /></p>

<p style="text-align: center;">Figure F.1: Examples of rivers in typeset text.</p>

<p>Celebrated river authority Flo Ng wants her new book on rivers of the world to include the longest typographic rivers possible. She plans to set the text in a mono-spaced font (all letters and spaces have equal width) in a left-aligned column of some fixed width, with exactly one space separating words on each line (the text is not aligned on the right). For Flo, a &ldquo;river&rdquo; is defined as a sequence of spaces lying in consecutive lines in which the position of each space in the sequence (except the first) differs by at most 1 from the position of the space in the line above it. Trailing white space cannot appear in a river. Words must be packed as tightly as possible on lines; no words may be split across lines. The line width used must be at least as long as the longest word in the text. For instance, Figure F.2 shows the same text set with two different line widths.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15694/2.png" style="width: 439px; height: 178px;" /></p>

<p style="text-align: center;">Figure F.2: Longest rivers (<code><span style="color:#ea3323;">*</span></code>) for two different line widths.</p>

<p>Given a text, you have been tasked with determining the line width that produces the longest river of spaces for that text.</p>

### 입력

<p>The first line of input contains an integer n (2 &le; n &le; 2 500) specifying the number of words in the text. The following lines of input contain the words of text. Each word consists only of lowercase and uppercase letters, and words on the same line are separated by a single space. No word exceeds 80 characters.</p>

### 출력

<p>Display the line width for which the input text contains the longest possible river, followed by the length of the longest river. If more than one line width yields this maximum, display the shortest such line width.</p>