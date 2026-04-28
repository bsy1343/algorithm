# [Bronze I] ROT13 - 11655

[문제 링크](https://www.acmicpc.net/problem/11655)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 34897, 정답: 20888, 맞힌 사람: 16927, 정답 비율: 60.339%

### 분류

구현, 문자열

### 문제 설명

<p>ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.</p>

<p>예를 들어, &quot;Baekjoon Online Judge&quot;를 ROT13으로 암호화하면 &quot;Onrxwbba Bayvar Whqtr&quot;가 된다. ROT13으로 암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다. 앞에서 암호화한 문자열 &quot;Onrxwbba Bayvar Whqtr&quot;에 다시 ROT13을 적용하면 &quot;Baekjoon Online Judge&quot;가 된다.</p>

<p>ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다. 알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다. 예를 들어, &quot;One is 1&quot;을 ROT13으로 암호화하면 &quot;Bar vf 1&quot;이 된다.</p>

<p>문자열이 주어졌을 때, &quot;ROT13&quot;으로 암호화한 다음 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째&nbsp;줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.</p>

### 출력

<p>첫째 줄에 S를 ROT13으로 암호화한 내용을 출력한다.</p>