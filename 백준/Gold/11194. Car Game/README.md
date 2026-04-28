# [Gold III] Car Game - 11194

[문제 링크](https://www.acmicpc.net/problem/11194)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 68, 정답: 24, 맞힌 사람: 22, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Traveling by car can sometimes be very boring. The natural cure for this boredom is to play a word game. In the following example the winner is he or she who has won the most rounds when the car stops. Each round starts with someone reading out loud the three letters on the license plate of an oncoming car. Whoever is first to say a word containing those letters in the same order wins the round. On the last road trip you failed miserably in this game, but this time you will be more prepared.</p>

<p>For each set of three letters find the first word in a dictionary that contains these letters in the same order.</p>

### 입력

<p>The first line of input contains two positive integers N &le; 5 000 and M &le; 10 000, the number of words in the dictionary and the number of license plates to be handled. Each of the following N lines contains a word from the dictionary, a string no more than 100 characters long containing only lower case letters from the English alphabet. This is followed by M lines each containing a string of three uppercase letters from the English alphabet, representing a license plate.</p>

### 출력

<p>For each license plate in the input you should output one line containing either the first valid word in the dictionary or the sentence &ldquo;No valid word&rdquo; if no such word exists.</p>