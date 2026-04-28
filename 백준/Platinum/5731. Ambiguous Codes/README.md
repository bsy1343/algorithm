# [Platinum IV] Ambiguous Codes - 5731

[문제 링크](https://www.acmicpc.net/problem/5731)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 9, 맞힌 사람: 9, 정답 비율: 37.500%

### 분류

자료 구조, 데이크스트라, 다이나믹 프로그래밍, 그래프 이론, 우선순위 큐, 최단 경로, 문자열, 트리, 트라이

### 문제 설명

<p>An extensive area of research in computer science is the field of communications. With computer networks being part of everyday life of many people, the development of ways for making networks faster, more reliable and secure is constantly needed. This practical need motivates an extensive research activity in the theory behind communications.</p>

<p>The very first thing needed to establish any kind of communication is a common code. A code is a way of changing the form of a piece of information into some other form, in general to make it possible to convey that piece of information from one place to another. Flag codes used by boats and the Morse code used in telegraphy are examples of codes for translating letters into different forms to enable communication over different media.</p>

<p>More formally, a code is a set of strings composed of symbols from one alphabet. Each string defined in the code is called a code word. A message is then composed concatenating a set of code words to convey the information needed. For example, in Morse code the alphabet is composed of the symbols hyphen and dot; letter &ldquo;S&rdquo; is represented by the code word &ldquo;...&rdquo;, letter &ldquo;O&rdquo; is represented by the code word &ldquo;---&rdquo;, and therefore the distress message &ldquo;SOS&rdquo; in Morse code is &ldquo;...---...&rdquo;.</p>

<p>Codes for communication can have many desirable and undesirable properties such as ambiguity, entropy, redundancy, and many more. In this problem we will focus on ambiguity as a key property.</p>

<p>A code is ambiguous when there exists a message using that code that can be partitioned into different sequences of code words. In other words, in an ambiguous code a message may have more than one meaning. For example, consider the binary alphabet, composed of symbols {0,1}. For the code composed of the words {10, 01, 101} the message 10101 can be understood as 10-101 or 101-01 and therefore the code is ambiguous. On the other hand, for the code composed of the words {01, 10, 011} no ambiguous message exists and therefore the code is unambiguous.</p>

<p>As a part of the computer science community, you are required to develop a tester that checks if codes are ambiguous. In case a code is indeed ambiguous, you are also required to report the length (i.e. the number of symbols) of the shortest ambiguous message for that code.</p>

### 입력

<p>Each test case will consist on several lines. In all test cases the alphabet will be the set of hexadecimal digits (decimal digits plus the uppercase letters &ldquo;A&rdquo; to &ldquo;F&rdquo;). The first line of a test case will contain an integer N (1 &le; N &le; 100), the number of code words in the code. Each of the next N lines describes a code word and contains a different and non-empty string of at most 50 hexadecimal digits.</p>

<p>Input is terminated by N = 0.</p>

<p>The input must be read from standard input.</p>

### 출력

<p>For each test case, output a single line with the length of the shortest ambiguous message for the provided code or -1 if the code is unambiguous.</p>

<p>The output must be written to standard output.</p>