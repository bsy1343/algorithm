# [Platinum III] SETI - 7384

[문제 링크](https://www.acmicpc.net/problem/7384)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 14, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>For some years, quite a lot of work has been put into listening to electromagnetic radio signals received from space, in order to understand what civilizations in distant galaxies might be trying to tell us. One signal source that has been of particular interest to the scientists at Universit de Technologie Spatiale is the Nebula Stupidicus.</p>

<p>Recently, it was discovered that if each message is assumed to be transmitted as a senquence of integers a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>n&minus;1</sub> the function f(k) = &sum;<sup>n&minus;1</sup><sub>i=0</sub> a<sub>i</sub>k<sup>i</sup> (mod p) always evaluates to values 0 &le; f(k) &le; 26 for 1 &le; k &le; n, provided that the correct value of p is used. n is of course the length of the transmitted message, and the ai denote integers such that 0 &le; a<sub>i</sub> &lt; p. p is a prime number that is guaranteed to be larger than n as well as larger than 26. It is, however, known to never exceed 30 000.</p>

<p>These relationships altogether have been considered too peculiar for being pure coincidences, which calls for further investigation.</p>

<p>The linguists at the faculty of Langues et Cultures Extraterrestres transcribe these messages to strings in the English alphabet to make the messages easier to handle while trying to interpret their meanings. The transcription procedure simply assigns the letters a..z to the values 1..26 that f(k) might evaluate to, such that 1 = a, 2 = b, etc. The value 0 is transcribed to &lsquo;&lowast;&lsquo; (an asterisk). While transcribing messages, the linguists simply loop from k = 1 to n, and append the character corresponding to the value of f(k) at the end of the string.</p>

<p>The backward transcription procedure, has however, turned out to be too complex for the linguists to handle by themselves. You are therefore assigned the task of writing a program that converts a set of strings to their corresponding Extra Terrestial number sequences.</p>

### 입력

<p>On the first line of the input there is a single positive integer N, telling the number of test cases to follow. Each case consists of one line containing the value of p to use during the transcription of the string, followed by the actual string to be transcribed. The only allowed characters in the string are the lower case letters &lsquo;a&rsquo;..&lsquo;z&rsquo; and &lsquo;&lowast;&rsquo; (asterisk). No string will be longer than 70 characters.</p>

### 출력

<p>For each transcribed string, output a line with the corresponding list of integers, separated by space, with each integer given in the order of ascending values of i.</p>