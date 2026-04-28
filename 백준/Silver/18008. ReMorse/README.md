# [Silver II] ReMorse - 18008

[문제 링크](https://www.acmicpc.net/problem/18008)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 62, 맞힌 사람: 54, 정답 비율: 80.597%

### 분류

그리디 알고리즘, 문자열, 정렬

### 문제 설명

<p>Morse code is an assignment of sequences of dot and dash symbols to alphabet characters. You are to reassign the sequences of Morse code so that it yields the shortest total length to a given message, and return that total length.</p>

<p>A dot symbol has length 1. A dash symbol has length 3. The gap between symbols within a character encoding has length 1. The gap between character encodings has length 3. Spaces, punctuation, and alphabetic case are ignored, so the text</p>

<p style="text-align: center;"><code><strong>The quick brown dog jumps over the lazy fox.</strong></code></p>

<p>is encoded as though it were</p>

<p style="text-align: center;"><strong><code>THEQUICKBROWNDOGJUMPSOVERTHELAZYFOX</code></strong></p>

<p>For instance, for the input <code><strong>ICPC</strong></code>, the answer is 17. Encode the <code><strong>C</strong></code>s with a single dot, the <code><strong>I</strong></code> with a dash, and the <code><strong>P</strong></code> with two dots, for an encoding of</p>

<p style="text-align: center;"><code>&minus; ∙ ∙∙ ∙</code></p>

<p>which has length (3) + 3 + (1) + 3 + (1 + 1 + 1) + 3 + (1) = 17.</p>

### 입력

<p>The single line of input consists of a string <em>s</em> (1 &le; |<em>s</em>| &le; 32000) of upper-case or lower-case letters, spaces, commas, periods, exclamation points, and/or question marks. Everything but the letters should be ignored. The line will contain at least one letter.</p>

### 출력

<p>Output a single integer, which is the length of 𝒔 when encoded with an optimal reassignment of the sequences of Morse code.</p>