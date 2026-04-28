# [Bronze I] Numbers - 11294

[문제 링크](https://www.acmicpc.net/problem/11294)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 209, 정답: 144, 맞힌 사람: 120, 정답 비율: 69.364%

### 분류

수학, 구현, 정수론

### 문제 설명

<p>Julia and Jeremy are twins who like to set each other challenges. Both have been learning about number systems, and are aware that we normally use decimal (base 10) numbers, probably because of the number of fingers we have.</p>

<p>The twins decided it would be fun to convert our numbers to number systems that other creatures may use, creatures who have a different number of digits or other appendages. See if you can rise to their challenge!</p>

### 입력

<p>Each challenge consists of 3 lines. The first line is a description of a creature (not necessarily real life). This will be no more than 20 characters in length. The final challenge begins with # - this challenge is not to be processed.</p>

<p>The second line of a challenge is the number of digits or appendages the twins assume the creature would use as a basis for its numbering system. This will be a number between 2 and 20 inclusive.</p>

<p>The final line is a decimal number which is to be converted into the assumed numbering system of the creature. This will be a positive integer no greater than 5,000</p>

### 출력

<p>Each challenge requires a single line of output. It consists of the name of the creature, followed by a comma and a space, followed by the decimal number, followed by another comma and space, followed by the converted number. As is usual, where a base larger than 10 is used, upper case letters of the alphabet (A to J, in alphabetical order) are used as extra digits.</p>

### 힌트

<p>Explanation for Hexapus</p>

<p>In decimal numbers, each place represents 10x the value of the place to its right, so 1,000s, 100s, 10s and 1s. 397 is 3 x 100 + 9 x 10 + 7. The hexapus (whatever one of those is!) uses 16 digits, 0 to 9 and A to F. With 16 digits, the places are 16x the value of the place to its right, so 3,364s, 256s, 16s and 1s.</p>

<p>18D for a hexapus is 1 x 256 + 8 x 16 + D (which is 13 in decimal) which is 256 + 128 + 13 which is 397 in decimal numbers. In the problem, you have to work backwards and convert 397 decimal to 18D.</p>