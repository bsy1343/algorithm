# [Bronze III] Eye of Sauron - 24405

[문제 링크](https://www.acmicpc.net/problem/24405)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 368, 정답: 293, 맞힌 사람: 258, 정답 비율: 79.876%

### 분류

구현, 문자열

### 문제 설명

<p>Little Elrond is obsessed with the Lord of the Rings series. Between lectures he likes to doodle the central tower of the great fortress Baradd&ucirc;r in the margins of his notebook. Afterward, he always double checks his drawings to ensure they are accurate: with the Eye of Sauron located in the very center of the tower. If any are incorrect, he makes sure to fix them.</p>

<p>You are to write a program that reads a representation of his tower, and ensures that the drawing is correct, with a properly centered eye.</p>

### 입력

<p>Input consists of a single string of length $n$, where $4 &le; n &le; 100$. Input strings will consist only of three types of characters: vertical bars, open parentheses, and closing parentheses. Input strings contain one or more vertical bars followed by a set of matching parentheses (the &ldquo;eye&rdquo;), followed by one or more vertical bars. For a drawing to be &ldquo;correct&rdquo;, the number of vertical bars on either side of the &ldquo;eye&rdquo; must match. Input will always contain a pair of correctly matched parentheses, with no characters between them. No other characters will appear in the string.</p>

### 출력

<p>On a single line print the word &ldquo;correct&rdquo; if the drawing is accurate or the word &ldquo;fix&rdquo; if there is an error that needs addressing.</p>