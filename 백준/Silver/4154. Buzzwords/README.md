# [Silver IV] Buzzwords - 4154

[문제 링크](https://www.acmicpc.net/problem/4154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 62, 맞힌 사람: 36, 정답 비율: 43.902%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The word the is the most common three-letter word. It even shows up inside other words, such as &quot;o<b>the</b>r&quot; and &quot;ma<b>the</b>matics&quot;. Sometimes it hides, split between two words, such as &quot;no<b>t he</b>re&quot;. Have you ever wondered what the most common words of lengths other than three are?</p>

<p>Your task is the following. You will be given a text. In this text, find the most common word of length one. If there are multiple such words, any one will do. Then count how many times this most common word appears in the text. If it appears more than once, output how many times it appears. Then repeat the process with words of length 2, 3, and so on, until you reach such a length that there is no longer any repeated word of that length in the text.</p>

### 입력

<p>The input consists of a sequence of lines. The last line of input is empty and should not be processed. Each line of input other than the last contains at least one but no more than one thousand uppercase letters and spaces. The spaces are irrelevant and should be ignored.</p>

### 출력

<p>For each line of input, output a sequence of lines, giving the number of repetitions of words of length 1, 2, 3, and so on. When you reach a length such that there are no repeated words of that length, output one blank line, do not output anything further for that input line, and move on to the next line of input.</p>