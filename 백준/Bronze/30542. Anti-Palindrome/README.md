# [Bronze I] Anti-Palindrome - 30542

[문제 링크](https://www.acmicpc.net/problem/30542)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 172, 정답: 94, 맞힌 사람: 77, 정답 비율: 54.610%

### 분류

구현, 문자열

### 문제 설명

<p>A palindrome is a sequence of two or more characters that reads the same both forward and backward.  Palindromes can appear inside a longer text, such as &ldquo;Happy days are here again.&rdquo; in which &ldquo;pp&rdquo;, &ldquo;ehe&rdquo; and &ldquo;ere&rdquo; are some of the palindromes (ignoring spaces, punctuation, and case). An anti-palindrome is a sequence of two or more characters in which there are no palindromes. You are given text that may contain, or itself form, a palindrome. Your task is to determine if there are any palindromes in the text, in which case declare &quot;Palindrome&quot;, or if there are none, declare &quot;Anti-palindrome&quot;.  The text may contain spaces, as well as alphabetic and other non-alphabetic characters.  All non-alphabetic characters should be ignored, and uppercase and lowercase letters are considered the same when detecting palindromes.</p>

### 입력

<p>The input consists of one line of text as specified above.  The input line will not be longer than 80 characters, and contains at least one alphabetic character.</p>

### 출력

<p>Print &quot;Palindrome&quot; if the text contains or is itself a palindrome, or &quot;Anti-palindrome&quot; if there are no palindromes in the text.</p>