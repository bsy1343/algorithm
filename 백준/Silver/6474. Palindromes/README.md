# [Silver V] Palindromes - 6474

[문제 링크](https://www.acmicpc.net/problem/6474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 397, 정답: 125, 맞힌 사람: 114, 정답 비율: 41.155%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>A regular palindrome is a string of numbers or letters that is the same forward as backward. &nbsp;For example, the string &quot;ABCDEDCBA&quot; is a palindrome because it is the same when the string is read from left to right as when the string is read from right to left.&nbsp;</p>

<p>A mirrored string is a string for which when each of the elements of the string is changed to its reverse (if it has a reverse) and the string is read backwards the result is the same as the original string. For example, the string &quot;3AIAE&quot; is a mirrored string because &quot;A&quot; and &quot;I&quot; are their own reverses, and &quot;3&quot; and &quot;E&quot; are each others&#39; reverses.&nbsp;</p>

<p>A mirrored palindrome is a string that meets the criteria of a regular palindrome and the criteria of a mirrored string. &nbsp;The string &quot;ATOYOTA&quot; is a mirrored palindrome because if the string is read backwards, the string is the same as the original and because if each of the characters is replaced by its reverse and the result is read backwards, the result is the same as the original string. &nbsp;Of course, &quot;A&quot;, &quot;T&quot;, &quot;O&quot;, and &quot;Y&quot; are all their own reverses.&nbsp;</p>

<p>A list of all valid characters and their reverses is as follows.&nbsp;</p>

<pre>
Character  Reverse   Character  Reverse   Character  Reverse 
    A         A          M         M          Y         Y 
    B                    N                    Z         5 
    C                    O         O          1         1 
    D                    P                    2         S 
    E         3          Q                    3         E 
    F                    R                    4 
    G                    S         2          5         Z 
    H         H          T         T          6 
    I         I          U         U          7 
    J         L          V         V          8         8 
    K                    W         W          9 
    L         J          X         X 
</pre>

<p>* Note that 0 (zero) and O (the letter) are considered the same character and therefore ONLY the letter &quot;O&quot; is a valid character.</p>

### 입력

<p>Input consists of strings (one per line) each of which will consist of one to twenty valid characters. There will be no invalid characters in any of the strings. Your program should read to the end of file.&nbsp;</p>

### 출력

<p>For each input string, you should print the string starting in column 1 immediately followed by exactly one of the following strings.&nbsp;</p>