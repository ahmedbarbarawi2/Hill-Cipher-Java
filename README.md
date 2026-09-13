# Hill Cipher Java

A simple Java implementation of the Hill Cipher encryption and decryption algorithm using a 2×2 key matrix.

## Description

This project implements the Hill Cipher, a classical cryptographic algorithm that encrypts and decrypts text using matrix multiplication and modular arithmetic.

The project includes:

* Key management and conversion of letters to numerical values.
* Plaintext preprocessing.
* Hill Cipher encryption.
* Hill Cipher decryption.
* Determinant calculation.
* Greatest Common Divisor (GCD) calculation.
* Modular multiplicative inverse calculation.
* Inverse key matrix calculation.

## How It Works

The Hill Cipher converts letters into numbers using the following mapping:

```text
a = 0, b = 1, c = 2, ..., z = 25
```

The plaintext is divided into pairs of letters. Each pair is represented as a 2×1 matrix and multiplied by the key matrix.

The result is calculated modulo 26.

### Encryption Formula

```text
C = K × P mod 26
```

Where:

* `K` = Key matrix
* `P` = Plaintext vector
* `C` = Ciphertext vector

### Decryption Formula

```text
P = K⁻¹ × C mod 26
```

The key matrix must have a valid modular inverse. Its determinant must be relatively prime to 26.

## Requirements

* Java Development Kit (JDK)
* Any Java IDE, such as Eclipse or IntelliJ IDEA

## Project Structure

```text
Hill-Cipher-Java/
└── Hillcipher.java
```

## Notes

* The implementation uses a 2×2 key matrix.
* The plaintext is converted to lowercase.
* If the plaintext length is odd, the letter `x` is added.
* The key must be invertible modulo 26 for decryption.
* This project is intended for educational purposes and demonstrates the basic mathematical operations behind the Hill Cipher.

## Example

For a valid 2×2 key matrix and plaintext, the program can:

1. Convert the key into numerical values.
2. Convert the plaintext into numerical values.
3. Encrypt the plaintext.
4. Calculate the inverse key.
5. Decrypt the ciphertext.

## Author

Ahmed Barbarawi
