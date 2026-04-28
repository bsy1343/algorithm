# [Platinum V] RSA - 13618

[문제 링크](https://www.acmicpc.net/problem/13618)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 332, 정답: 170, 맞힌 사람: 125, 정답 비율: 72.674%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 오일러 피 함수, 확장 유클리드 호제법

### 문제 설명

<p>O algoritmo RSA &eacute; um dos algoritmos de criptografia mais utilizados e &eacute; considerado uma das alternativas mais seguras existentes. Seu funcionamento b&aacute;sico &eacute; descrito a seguir.</p>

<p>Dois n&uacute;meros primos &iacute;mpares P e Q s&atilde;o escolhidos e calcula-se N = PQ. A seguir &eacute; calculada a fun&ccedil;&atilde;o totiente &phi;(N) = (P &minus; 1)(Q &minus; 1) e um inteiro e satisfazendo 1 &lt; E &lt; &phi;(N) &eacute; escolhido de forma que mdc(&phi;(N), e) = 1. Finalmente &eacute; calculado o inteiro D, o inverso multiplicativo de e m&oacute;dulo &phi;(N), ou seja, o inteiro D satisfazendo DE = 1 (mod &phi;(N)).</p>

<p>Assim obtemos a chave p&uacute;blica, formada pelo par de inteiros N e E, e a chave secreta, formada<br />
pelos inteiros N e D.</p>

<p>Para criptografar uma mensagem M, com 0 &lt; M &lt; N, calcula-se C = M<sup>e</sup> (mod N), e C &eacute; a mensagem criptografada. Para descriptograf&aacute;-la, ou seja, para recuperar a mensagem original, basta calcular M = C<sup>d</sup> (mod n). Note que, para isso, a chave secreta deve ser conhecida, n&atilde;o sendo suficiente o conhecimento da chave p&uacute;blica. Note ainda que a express&atilde;o x = 1 (mod y) usada acima equivale a dizer que y &eacute; o menor natural tal que o resto da divis&atilde;o de x por y &eacute; 1.</p>

<p>Neste problema voc&ecirc; deve escrever um programa para quebrar a criptografia RSA.</p>

### 입력

<p>A &uacute;nica linha da entrada cont&eacute;m tr&ecirc;s inteiros N, E, e C, onde 15 &le; N &le; 10<sup>9</sup> , 1 &le; E &lt; N e 1 &le; C &lt; N, de forma que N e E constituem a chave p&uacute;blica do algoritmo RSA descrita acima e C &eacute; uma mensagem criptografada com essa chave p&uacute;blica.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha, contendo um &uacute;nico inteiro M, 1 &le; M &lt; N , a mensagem original.</p>