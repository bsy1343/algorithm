# [Gold III] Hiding Merlin - 16107

[문제 링크](https://www.acmicpc.net/problem/16107)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 188, 정답: 32, 맞힌 사람: 24, 정답 비율: 13.873%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The war is coming to an end. King Arthur and his loyal servants have grouped together to eradicate Mordred and his minions. If all goes well, the war will be over by tomorrow. The only thing that now worries King Arthur is the news that an assassin is out to get Merlin.</p>

<p>King Arthur has decided to hide Merlin in one of the billion houses in Camlann. The houses in Camlann are numbered 1, 2, . . . , 999 999 999, 1 000 000 000. Because King Arthur does not want to forget which house he has hid Merlin in, he would like to write it down. However, King Arthur is worried about security, so he is going to encrypt the house number. But since this is the fifth century AD, the encryption that he will use is quite primitive. He first writes the number down as a sum of positive square numbers, then concatenates those squares together and writes down that string.</p>

<p>For example, if the house number is 46, then he could write down 3691 since 46 = 36 + 9+ 1 = 6<sup>2</sup> + 3<sup>2</sup> + 1<sup>2</sup>. King Arthur could also write down 1369 (46 = 1 + 36 + 9) or 1619416 (46 = 16 + 1 + 9 + 4 + 16). King Arthur writes each of the squares with no leading zeroes.</p>

<p>What is the smallest house number in Camlann that is consistent with the encrypted house number that King Arthur wrote down?</p>

### 입력

<p>The input consists of a single line containing a string, which is the encrypted house number. The encrypted house number contains only digits (0, 1, . . . , 9) and has length at least 1 and at most 100 000.</p>

### 출력

<p>Display the smallest house number in Camlann that is consistent with the encrypted house number. If the encrypted house number could not have been obtained by King Arthur&rsquo;s encryption scheme, display -1 instead.</p>