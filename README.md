# Invoice Calculator (Java Swing)

A desktop invoice calculator built with Java Swing. Enter a subtotal and the app automatically applies tiered discounts and displays the final invoice total.

## Features

- Simple GUI built with Java Swing (`JFrame`, `JPanel`, `JTextField`, `JButton`)
- Tiered discount logic:
  - 20% off subtotals of $200 or more
  - 10% off subtotals of $100–$199.99
  - No discount below $100
- Real-time calculation on button click
- Clean exit handling

## Screenshot

_Add a screenshot here after running the app locally — drag the image into this repo and reference it like:_
`![Invoice Calculator screenshot](screenshot.png)`

## Tech Stack

- Java 21
- Java Swing (GUI)
- Java AWT (event handling)

## Project Structure

```
InvoiceSwingApp/
├── src/
│   ├── module-info.java
│   └── invoiceapp/
│       ├── InvoiceApp.java      # entry point
│       ├── InvoiceFrame.java    # main window
│       └── InvoicePanel.java    # UI + discount logic
└── README.md
```

## How to Run

**Requires:** JDK 11 or later installed locally.

```bash
# From the src/ directory
javac -d out invoiceapp/*.java module-info.java
java -cp out invoiceapp.InvoiceApp
```

Or open the project in any Java IDE (Eclipse, IntelliJ) and run `InvoiceApp.java` directly.

## What I Learned

This project reinforced event-driven programming in Java (`ActionListener`), building layouts with Swing components, and structuring a small GUI app with separation between the entry point, the window (`JFrame`), and the UI logic (`JPanel`).

## Author

Built as part of a Java and Internet Applications course, Fall 2026.
