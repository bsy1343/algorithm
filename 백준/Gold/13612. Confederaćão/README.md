# [Gold IV] Confederaćão - 13612

[문제 링크](https://www.acmicpc.net/problem/13612)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

비트마스킹, 자료 구조, 기하학, 3차원 기하학, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>A Confedera&ccedil;&atilde;o Gal&aacute;tica resolveu fazer uma reforma administrativa, para melhor distribuir os recursos de sua frota. Para isso, ela dividiu todo o espa&ccedil;o em regi&otilde;es. Para definir as regi&otilde;es, inicialmente um conjunto de planos infinitos foi especificado, e as regi&otilde;es foram definidas pelos cortes desses planos. Note que algumas regi&otilde;es s&atilde;o ilimitadas, mas que tamb&eacute;m podem existir regi&otilde;es limitadas. O conjunto de planos foi escolhido de tal maneira que nenhum dos planos intercepta a &oacute;rbita de um planeta, e portanto cada planeta transita por apenas uma regi&atilde;o durante sua &oacute;rbita (ou seja, um planeta dentro de uma regi&atilde;o nunca cruzar&aacute; um plano para outra regi&atilde;o).</p>

<p>Sua tarefa consiste em determinar, dadas as equa&ccedil;&otilde;es dos planos e as posi&ccedil;&otilde;es dos planetas, quantos planetas existem na regi&atilde;o com o maior n&uacute;mero de planetas (em outras palavras, qual o n&uacute;mero m&aacute;ximo de planetas dentro de uma regi&atilde;o).</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros M (1 &le; M &le; 500) e N (1 &le; N &le; 10000), indicando respectivamente o n&uacute;mero de planos e n&uacute;mero de planetas. As M linhas seguintes cont&ecirc;m cada uma quatro inteiros A, B, C e D (&minus;10000 &le; A, B, C, D &le; 10000), os coeficientes e o termo livre da equa&ccedil;&atilde;o Ax + By + Cz = D que define cada um dos planos. A seguir, cada uma das N linhas seguintes cont&eacute;m tr&ecirc;s inteiros X, Y e Z (&minus;10000 &le; X, Y, Z &le; 10000), indicando a posi&ccedil;&atilde;o (X, Y, Z) de um planeta.</p>

<p>&nbsp;</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha contendo apenas um n&uacute;mero inteiro, o n&uacute;mero de planetas na regi&atilde;o que cont&eacute;m o maior n&uacute;mero de planetas.</p>